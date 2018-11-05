package com.angzhao.service.Impl;


import com.angzhao.dao.recommendDao;
import com.angzhao.entity.foodEntity;
import com.angzhao.service.recommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 */

@Service
public class recommendServicelmpl implements recommendService{

    @Autowired
    recommendDao recommendDao;

    @Override
    public int inserttRecommendFood(foodEntity food) {
        int i = recommendDao.insertRecommendId(food);
        if (i == 1) {
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public int deteleRecommendFood(foodEntity food) {
        int i = recommendDao.deleteRecommendId(food);
        if (i == 1) {
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public foodEntity queryRecommendFood(foodEntity food) {
        return recommendDao.queryRecommendId(food);
    }

}
