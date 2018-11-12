package com.angzhao.service;

import com.angzhao.entity.foodEntity;

public interface seasonService {


    /**
     *
     * @param food
     * @return
     */
    foodEntity insertSeasonFood(foodEntity food);

    foodEntity deleteSeasonFood(foodEntity food);

    foodEntity querySeasonFood(foodEntity food);

}
