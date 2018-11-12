package com.angzhao.service;

import com.angzhao.entity.orderFormEntity;

import java.util.List;

public interface orderFormService {

    /**
     *
     * @param userId
     * @return
     */



    List<orderFormEntity> getOrderFormByUserId(String userId);

    List<orderFormEntity> getWaitPayOrderFormByUserId(String userId);

    List<orderFormEntity> getWaitCommentOrderFormByUserId(String userId);

    orderFormEntity cancelOrderFormByOrderId(orderFormEntity orderForm);

    orderFormEntity payOrderFormByOrderId(orderFormEntity orderForm);

    orderFormEntity getOrderForm(String id);

}
