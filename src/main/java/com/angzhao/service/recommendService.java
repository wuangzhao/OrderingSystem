package com.angzhao.service;

import com.angzhao.entity.foodEntity;

import java.util.List;

public interface recommendService {


    /**
     *
     * @param food
     * @return
     */
    foodEntity insertRecommendFood(foodEntity food);

    int deleteRecommendFood(foodEntity food);

    foodEntity queryRecommendFood(foodEntity food);

    List<foodEntity> getRecommendList();

    List<foodEntity> getNotRecommendList();
}
