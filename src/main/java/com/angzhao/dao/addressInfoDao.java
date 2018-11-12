package com.angzhao.dao;

import com.angzhao.entity.addressEntity;

import java.util.List;

public interface addressInfoDao {

    /**
     *
     * @param userAddress
     * @return
     */

    int insertByAddress(addressEntity userAddress);

    int deleteByAddress(String userId);

    int updateByAddress(addressEntity userAddress);

    addressEntity queryByAddress(String userId);

    List<addressEntity> queryByUserId(String userId);
}
