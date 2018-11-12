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
    public homeImgEntity insertHomeImg(String homeImgPath) {
        homeImgEntity homeImgEntity = homeImgDao.queryHomeImg(homeImgPath);
        if(homeImgEntity == null) {
            int b = homeImgDao.insertHomeImg(homeImgPath);
            if(b == 1) {
                homeImgEntity homeImgEntity1 = homeImgDao.queryHomeImg(homeImgPath);
                if(homeImgEntity1 != null) {
                    return homeImgEntity1;
                }
                else {
                    return null;
                }
            }
            else {
                return null;
            }
        }
        else {
            return null;
        }
    }

    @Override
    public int deleteHomeImg(String homeImgPath) {
        homeImgEntity homeImgEntity = homeImgDao.queryHomeImg(homeImgPath);
        if(homeImgEntity != null) {
           int a = homeImgDao.deleteHomeImg(homeImgPath);
           if(a == 1) {
               return 1;
           }
           else {
               return 0;
           }
        }
        else {
            return 0;
        }
    }


    @Override
    public homeImgEntity queryHomeImg(String homeImgPath) {
        homeImgEntity homeImgEntity = homeImgDao.queryHomeImg(homeImgPath);
        if(homeImgEntity != null) {
            return homeImgEntity;
        }
        else {
            return null;
        }
    }

    @Override
    public List<homeImgEntity> getAllImgName() {
        return homeImgDao.queryAllImgName();
    }
}
