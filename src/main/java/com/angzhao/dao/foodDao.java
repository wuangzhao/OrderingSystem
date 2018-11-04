package com.angzhao.dao;

import com.angzhao.entity.foodEntity;

public interface foodDao {

    int insertByFoods(foodEntity food);

    int deleteByFoods(String foodId);

    int updateByFoods(foodEntity food);

    foodEntity queryByFoodId(String foodId);
}
