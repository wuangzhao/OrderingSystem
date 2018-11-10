package com.angzhao.service.Impl;

import com.angzhao.dao.seasonDao;
import com.angzhao.entity.foodEntity;
import com.angzhao.service.seasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class seasonServiceImpl implements seasonService {

    @Autowired
    seasonDao seasonDao;

    @Override
    public foodEntity insertSeasonFood(foodEntity food) {
        int i = seasonDao.insertSeasonId(food);
        if (i == 1) {
            return food;
        }
        else {
            return null;
        }
    }

    @Override
    public foodEntity deleteSeasonFood(foodEntity food) {
        int i = seasonDao.deleteSeasonId(food);
        if (i == 1) {
            return food;
        }
        else {
            return null;
        }
    }

    @Override
    public foodEntity querySeasonFood(foodEntity food) {
        return seasonDao.querySeasonId(food);
    }


}
