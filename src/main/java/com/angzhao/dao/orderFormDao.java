package com.angzhao.dao;

import com.angzhao.entity.orderFormDetailEntity;
import com.angzhao.entity.orderFormEntity;

import java.util.List;

public interface orderFormDao {

    int updateOrderFormStatus(orderFormEntity orderForm);

    int insertByOrderForm(orderFormEntity orderFormEntity);

    int deleteByOrderForm(String orderFormId);

    int updateByOrderForm(orderFormEntity orderFormEntity);

    int insertOrderFormDetail(orderFormDetailEntity orderFormDetailEntity);

    int insertAdminOrderById(String orderId);

    orderFormEntity queryOrderFormById(String id);

    orderFormEntity queryWaitPayOrderFormById(String id);

    List<orderFormEntity> queryOrderFormListByUserId(String userId);

    List<orderFormEntity> querySuccessAdminOrderFormList();

    List<orderFormEntity> queryNotSuccessAdminOrderFormList();

    List<orderFormEntity> queryAdminOrderFormList();


    List<orderFormEntity> queryWaitPayOrderFormListByUserId(String userId);

    List<orderFormEntity> queryWaitCommentOrderFormListByUserId(String userId);

    List<orderFormDetailEntity> queryOrderFormDetailByOrderFrom(orderFormEntity orderForm);


}
