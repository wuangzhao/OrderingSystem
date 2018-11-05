package com.angzhao.service;

import com.angzhao.entity.foodEntity;

public interface recommendService {


    /**
     *
     * @param food
     * @return
     */
    int inserttRecommendFood(foodEntity food);

    int deteleRecommendFood(foodEntity food);

    foodEntity queryRecommendFood(foodEntity food);
}
