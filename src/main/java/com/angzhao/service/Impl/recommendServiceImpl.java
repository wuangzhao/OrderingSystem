package com.angzhao.service.Impl;


import com.angzhao.dao.recommendDao;
import com.angzhao.entity.foodEntity;
import com.angzhao.service.recommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class recommendServiceImpl implements recommendService{

    @Autowired
    recommendDao recommendDao;

    @Override
    public foodEntity insertRecommendFood(foodEntity food) {
        int i = recommendDao.insertRecommendId(food);
        if (i == 1) {
            return food;
        }
        else {
            return null;
        }
    }

    @Override
    public int deleteRecommendFood(foodEntity food) {
        return recommendDao.deleteRecommendId(food);
    }

    @Override
    public foodEntity queryRecommendFood(foodEntity food) {
        return recommendDao.queryRecommendId(food);
    }

    @Override
    public List<foodEntity> getRecommendList() {
        return recommendDao.queryRecommendList();
    }

    @Override
    public List<foodEntity> getNotRecommendList() {
        return recommendDao.queryNotRecommendList();
    }

}
