package com.angzhao.service.Impl;

import com.angzhao.dao.orderFormDao;
import com.angzhao.model.orderFormDetailModel;
import com.angzhao.entity.orderFormEntity;
import com.angzhao.service.orderFormService;
import com.angzhao.util.orderFormUtil;
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
        getOrderFormDetail(orderFormList);
        return orderFormList;
    }

    @Override
    public List<orderFormEntity> getAdminOrderForm() {
        List<orderFormEntity> orderFormList = orderFormDao.queryAdminOrderFormList();
        getOrderFormDetail(orderFormList);
        return orderFormList;
    }

    @Override
    public List<orderFormEntity> getSuccessAdminOrderForm() {
        List<orderFormEntity> orderFormList = orderFormDao.querySuccessAdminOrderFormList();
        getOrderFormDetail(orderFormList);
        return orderFormList;
    }

    @Override
    public List<orderFormEntity> getNotSuccessAdminOrderForm() {
        List<orderFormEntity> orderFormList = orderFormDao.queryNotSuccessAdminOrderFormList();
        getOrderFormDetail(orderFormList);
        return orderFormList;
    }

    @Override
    public List<orderFormEntity> getWaitPayOrderFormByUserId(String userId) {
        List<orderFormEntity> orderFormList = orderFormDao.queryWaitPayOrderFormListByUserId(userId);
        getOrderFormDetail(orderFormList);
        return orderFormList;
    }

    @Override
    public List<orderFormEntity> getWaitCommentOrderFormByUserId(String userId) {
        List<orderFormEntity> orderFormList = orderFormDao.queryWaitCommentOrderFormListByUserId(userId);
        getOrderFormDetail(orderFormList);
        return orderFormList;
    }

    private void getOrderFormDetail(List<orderFormEntity> orderFormList) {
        for (orderFormEntity orderForm : orderFormList) {
            List<orderFormDetailModel> orderFormDetailList = orderFormDao.queryOrderFormDetailByOrderFrom(orderForm);
            orderForm.setStatus(orderFormUtil.translate(orderForm.getStatus()));
            int totalPrice = 0;
            int totalAmount = 0;
            for (orderFormDetailModel orderFormDetail : orderFormDetailList) {
                orderFormDetail.setTotalPrice(orderFormDetail.getAmount() * orderFormDetail.getFoodPrice());
                totalPrice += orderFormDetail.getTotalPrice();
                totalAmount += orderFormDetail.getAmount();
            }
            orderForm.setOrderFormDetailList(orderFormDetailList);
            orderForm.setTotalAmount(totalAmount);
            orderForm.setTotalPrice(totalPrice);
        }
    }


    @Override
    public orderFormEntity cancelOrderFormByOrderId(orderFormEntity orderForm) {
        orderForm.setStatus("-1");
        int i = orderFormDao.updateOrderFormStatus(orderForm);
        if (i == 0) {
            return null;
        } else {
            return orderForm;
        }
    }

    @Override
    public orderFormEntity payOrderFormByOrderId(orderFormEntity orderForm) {
        orderForm.setStatus("2");
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

    @Override
    public String insertAdminOrder(String orderId) {
        orderFormDao.insertAdminOrderById(orderId);
        return orderId;
    }

    @Override
    public orderFormDetailModel insertOrderFormDetail(orderFormDetailModel orderFormDetailModel) {
        if (orderFormDao.insertOrderFormDetail(orderFormDetailModel) == 1) {
            return orderFormDetailModel;
        } else {
            return null;
        }
    }

}
