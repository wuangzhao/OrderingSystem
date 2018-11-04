package com.angzhao.dao;

import com.angzhao.entity.foodEntity;

import java.util.List;

public interface foodDao {

    int insert(foodEntity food);

    int delete(String foodId);

    foodEntity queryByFoodId(String foodId);

    int update(foodEntity food);

    List<foodEntity> queryByFoodName(String foodName);
}
