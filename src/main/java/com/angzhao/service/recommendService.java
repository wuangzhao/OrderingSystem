package com.angzhao.service;

import com.angzhao.entity.foodEntity;

public interface recommendService {


    /**
     *
     * @param food
     * @return
     */
    int insertRecommendFood(foodEntity food);

    int deleteRecommendFood(foodEntity food);

    foodEntity queryRecommendFood(foodEntity food);
}
