package com.angzhao.dao;

import com.angzhao.entity.foodEntity;

import java.util.List;

public interface foodDao {

    /**
     *
     * @param food
     * @return
     */

    int insertByFoods(foodEntity food);

    int deleteByFoods(String foodId);

    int updateByFoods(foodEntity food);

    foodEntity queryByFoodId(String foodId);

    List<foodEntity> queryByFoodName(String foodName);
}
