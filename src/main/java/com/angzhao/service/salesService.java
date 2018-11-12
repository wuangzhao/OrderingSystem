package com.angzhao.service;

import com.angzhao.entity.foodEntity;

public interface salesService {


    /**
     *
     * @param food
     * @return
     */
    foodEntity insertSalesFood(foodEntity food);

    foodEntity deleteSalesFood(foodEntity food);

    foodEntity querySalesFood(foodEntity food);

}
