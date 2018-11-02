package com.angzhao.service.Impl;

import com.angzhao.dao.homeImgDao;
import com.angzhao.service.homeImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class homeImgServiceImpl implements homeImgService {

    @Autowired
    homeImgDao homeImgDao;

    @Override
    public List<String> getAllImgName() {
        return homeImgDao.queryAllImgName();
    }
}