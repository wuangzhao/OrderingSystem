package com.angzhao.service.Impl;

import com.angzhao.dao.foodDao;
import com.angzhao.dao.shoppingCartDetailDao;
import com.angzhao.entity.foodAndAmount;
import com.angzhao.entity.foodEntity;
import com.angzhao.entity.shoppingCart;
import com.angzhao.entity.shoppingCartDetail;
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
}
