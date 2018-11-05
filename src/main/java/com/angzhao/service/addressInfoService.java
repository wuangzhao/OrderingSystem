package com.angzhao.service;

import com.angzhao.entity.addressEntity;

import java.util.List;

public interface addressInfoService {

    List<addressEntity> getAddressInfoListByUserId(String userId);
}
