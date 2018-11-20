package com.angzhao.service.Impl;

import com.angzhao.dao.foodDao;
import com.angzhao.dao.orderFormDao;
import com.angzhao.dao.shoppingCartDetailDao;
import com.angzhao.entity.*;
import com.angzhao.model.foodAndAmountModel;
import com.angzhao.model.orderFormDetailModel;
import com.angzhao.model.shoppingCartDetailModel;
import com.angzhao.service.shoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class shoppingCartServiceImpl implements shoppingCartService {

    @Autowired
    shoppingCartDetailDao shoppingCartDetailDao;

    @Autowired
    foodDao foodDao;

    @Autowired
    orderFormDao orderFormDao;

    @Override
    public shoppingCartEntity getShoppingCartListByUserId(String userId) {
        List<shoppingCartDetailModel> shoppingCartDetailModelList = shoppingCartDetailDao.queryByUserId(userId);
        shoppingCartEntity shoppingCartEntity = new shoppingCartEntity();
        List<foodAndAmountModel> foodAndAmountModelList = new ArrayList<>();
        for (shoppingCartDetailModel detail : shoppingCartDetailModelList) {
            foodAndAmountModel foodAndAmountModel = new foodAndAmountModel();
            foodAndAmountModel.setFoodAmount(detail.getFoodAmount());
            foodEntity foodEntity = foodDao.queryByFoodId(detail.getFoodId());
            foodAndAmountModel.setFoodEntity(foodEntity);
            foodAndAmountModelList.add(foodAndAmountModel);
            int totalPrice = shoppingCartEntity.getTotalPrice();
            totalPrice += foodEntity.getFoodPrice() * detail.getFoodAmount();
            shoppingCartEntity.setTotalPrice(totalPrice);
        }
        shoppingCartEntity.setFoodAndAmountModelList(foodAndAmountModelList);
        shoppingCartEntity.setUserId(userId);
        shoppingCartEntity.setAmount(foodAndAmountModelList.size());
        return shoppingCartEntity;
    }

    @Override
    public boolean addShoppingCartDetail(shoppingCartDetailModel shoppingCartDetailModel) {
        List<shoppingCartDetailModel> cartDetailList = shoppingCartDetailDao.queryByUserId(shoppingCartDetailModel.getUserId());
        for (shoppingCartDetailModel detail : cartDetailList) {
            if (detail.getFoodId().equals(shoppingCartDetailModel.getFoodId())) {
                shoppingCartDetailModel.setFoodAmount(detail.getFoodAmount() + 1);
                return shoppingCartDetailDao.update(shoppingCartDetailModel) == 1;
            }
        }
        return shoppingCartDetailDao.insert(shoppingCartDetailModel) == 1;
    }

    @Override
    public boolean payment(String userId) {
        List<shoppingCartDetailModel> shoppingCartDetailModelList = shoppingCartDetailDao.queryByUserId(userId);
        if (shoppingCartDetailModelList.size() == 0) {
            return false;
        }
        else {
            orderFormEntity orderForm = new orderFormEntity();
            orderForm.setStatus("1");
            orderForm.setUserId(userId);
            orderFormDao.insertByOrderForm(orderForm);
            String orderFormId = orderForm.getOrderFormId();
            System.out.println(orderFormId);
            List<orderFormDetailModel> orderFormDetailList = new ArrayList<>();
            for (shoppingCartDetailModel detail : shoppingCartDetailModelList) {
                orderFormDetailModel orderFormDetailModel = new orderFormDetailModel();
                orderFormDetailModel.setOrderFormId(orderFormId);
                orderFormDetailModel.setFoodId(detail.getFoodId());
                orderFormDetailModel.setAmount(detail.getFoodAmount());
                orderFormDao.insertOrderFormDetail(orderFormDetailModel);
                orderFormDetailList.add(orderFormDetailModel);
                shoppingCartDetailDao.delete(detail);
            }
            return true;
        }
    }
}
