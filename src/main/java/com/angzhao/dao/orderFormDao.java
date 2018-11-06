package com.angzhao.dao;

import com.angzhao.entity.orderFormDetailEntity;
import com.angzhao.entity.orderFormEntity;
import com.angzhao.entity.userEntity;

import java.util.List;

public interface orderFormDao {

    List<orderFormEntity> queryOrderFormListByUserId(String userId);

    List<orderFormDetailEntity> queryOrderFormDetailByOrderFrom(orderFormEntity orderForm);
}
