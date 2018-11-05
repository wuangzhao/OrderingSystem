package com.angzhao.service.Impl;

import com.angzhao.dao.addressInfoDao;
import com.angzhao.entity.addressEntity;
import com.angzhao.service.addressInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class addressInfoServiceImpl implements addressInfoService {

    @Autowired
    addressInfoDao addressInfoDao;


    @Override
    public List<addressEntity> getAddressInfoListByUserId(String userId) {
        return addressInfoDao.queryByUserId(userId);
    }
}
