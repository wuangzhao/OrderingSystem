package com.angzhao.service;

import com.angzhao.entity.orderFormEntity;

import java.util.List;

public interface orderFormService {

    List<orderFormEntity> getOrderFormByUserId(String userId);
}
