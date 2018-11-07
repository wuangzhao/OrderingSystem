package com.angzhao.service.Impl;

import com.angzhao.dao.orderFormDao;
import com.angzhao.entity.orderFormDetailEntity;
import com.angzhao.entity.orderFormEntity;
import com.angzhao.service.orderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderFormServiceImpl implements orderFormService {

    @Autowired
    orderFormDao orderFormDao;


    @Override
    public List<orderFormEntity> getOrderFormByUserId(String userId) {
        List<orderFormEntity> orderFormList = orderFormDao.queryOrderFormListByUserId(userId);
        for (orderFormEntity orderForm : orderFormList) {
            List<orderFormDetailEntity> orderFormDetailList = orderFormDao.queryOrderFormDetailByOrderFrom(orderForm);

            int totalPrice = 0;
            int totalAmount = 0;
            for (orderFormDetailEntity orderFormDetail : orderFormDetailList) {
                orderFormDetail.setTotalPrice(orderFormDetail.getAmount() * orderFormDetail.getFoodPrice());
                totalPrice += orderFormDetail.getTotalPrice();
                totalAmount += orderFormDetail.getAmount();
            }
            orderForm.setOrderFormDetailList(orderFormDetailList);
            orderForm.setTotalAmount(totalAmount);
            orderForm.setTotalPrice(totalPrice);
        }
        return orderFormList;
    }

    @Override
    public orderFormEntity cancelOrderFormByOrderId(orderFormEntity orderForm) {
        orderForm.setStatus(-1);
        int i = orderFormDao.updateOrderFormStatus(orderForm);
        if (i == 0) {
            return null;
        } else {
            return orderForm;
        }
    }

    @Override
    public orderFormEntity getOrderForm(String id) {
        return orderFormDao.queryOrderFormById(id);
    }

}
