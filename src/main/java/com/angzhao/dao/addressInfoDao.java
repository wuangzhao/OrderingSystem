package com.angzhao.dao;

import com.angzhao.entity.addressEntity;

import java.util.List;

public interface addressInfoDao {

    List<addressEntity> queryByUserId(String userId);
}
