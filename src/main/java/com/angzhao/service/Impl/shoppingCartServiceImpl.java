package com.angzhao.service.Impl;

import com.angzhao.dao.foodDao;
import com.angzhao.dao.orderFormDao;
import com.angzhao.dao.shoppingCartDetailDao;
import com.angzhao.entity.*;
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
    public shoppingCart getShoppingCartListByUserId(String userId) {
        List<shoppingCartDetail> shoppingCartDetailList = shoppingCartDetailDao.queryByUserId(userId);
        shoppingCart shoppingCart = new shoppingCart();
        List<foodAndAmount> foodAndAmountList = new ArrayList<>();
        for (shoppingCartDetail detail : shoppingCartDetailList) {
            foodAndAmount foodAndAmount = new foodAndAmount();
            foodAndAmount.setFoodAmount(detail.getFoodAmount());
            foodEntity foodEntity = foodDao.queryByFoodId(detail.getFoodId());
            foodAndAmount.setFoodEntity(foodEntity);
            foodAndAmountList.add(foodAndAmount);
            int totalPrice = shoppingCart.getTotalPrice();
            totalPrice += foodEntity.getFoodPrice() * detail.getFoodAmount();
            shoppingCart.setTotalPrice(totalPrice);
        }
        shoppingCart.setFoodAndAmountList(foodAndAmountList);
        shoppingCart.setUserId(userId);
        shoppingCart.setAmount(foodAndAmountList.size());
        return shoppingCart;
    }

    @Override
    public boolean addShoppingCartDetail(shoppingCartDetail shoppingCartDetail) {
        List<shoppingCartDetail> cartDetailList = shoppingCartDetailDao.queryByUserId(shoppingCartDetail.getUserId());
        for (com.angzhao.entity.shoppingCartDetail detail : cartDetailList) {
            if (detail.getFoodId().equals(shoppingCartDetail.getFoodId())) {
                shoppingCartDetail.setFoodAmount(detail.getFoodAmount() + 1);
                return shoppingCartDetailDao.update(shoppingCartDetail) == 1;
            }
        }
        return shoppingCartDetailDao.insert(shoppingCartDetail) == 1;
    }

    @Override
    public boolean payment(String userId) {
        orderFormEntity orderForm = new orderFormEntity();
        orderForm.setStatus("1");
        orderForm.setUserId(userId);
        orderFormDao.insertByOrderForm(orderForm);
        String orderFormId = orderForm.getOrderFormId();
        System.out.println(orderFormId);
        List<orderFormDetailEntity> orderFormDetailList = new ArrayList<>();
        List<shoppingCartDetail> shoppingCartDetailList = shoppingCartDetailDao.queryByUserId(userId);
        for (shoppingCartDetail detail : shoppingCartDetailList) {
            orderFormDetailEntity orderFormDetailEntity = new orderFormDetailEntity();
            orderFormDetailEntity.setOrderFormId(orderFormId);
            orderFormDetailEntity.setFoodId(detail.getFoodId());
            orderFormDetailEntity.setAmount(detail.getFoodAmount());
            orderFormDao.insertOrderFormDetail(orderFormDetailEntity);
            orderFormDetailList.add(orderFormDetailEntity);
            shoppingCartDetailDao.delete(detail);
        }
         return false;
    }
}
