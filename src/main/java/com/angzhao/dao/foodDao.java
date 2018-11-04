package com.angzhao.dao;

import com.angzhao.entity.foodEntity;

public interface foodDao {

    int insert(foodEntity food);

    int delete(String foodId);

    foodEntity queryByFoodId(String foodId);

    int update(foodEntity food);
}
