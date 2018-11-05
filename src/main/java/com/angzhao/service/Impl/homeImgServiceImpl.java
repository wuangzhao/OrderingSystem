package com.angzhao.service.Impl;

import com.angzhao.dao.homeImgDao;
import com.angzhao.entity.homeImgEntity;
import com.angzhao.service.homeImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class homeImgServiceImpl implements homeImgService {

    @Autowired
    homeImgDao homeImgDao;

    @Override
    public int insertHomeImg(String homeImgPath) {
        homeImgEntity homeImgEntity = new homeImgEntity();
        homeImgEntity.setHomeImgPath(homeImgPath);
        int i = homeImgDao.insertHomeImg(homeImgEntity);
        if(i == 1) {
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public int deleteHomeImg(int homeImgId) {
        homeImgEntity homeImgEntity = homeImgDao.queryHomeImg(homeImgId);
        if(homeImgEntity != null) {
            homeImgDao.deleteHomeImg(homeImgId);
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public int updateHomeImg(int homeImgId,String homeImgPath) {
        homeImgEntity homeImgEntity = homeImgDao.queryHomeImg(homeImgId);
        if(homeImgEntity != null) {
            homeImgEntity.setHomeImgPath(homeImgPath);
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public int queryHomeImg(int homeImgId) {
        homeImgEntity homeImgEntity = homeImgDao.queryHomeImg(homeImgId);
        if(homeImgEntity != null) {
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public List<homeImgEntity> getAllImgName(int homeImgId) {
        return homeImgDao.queryAllImgName(homeImgId);
    }
}
