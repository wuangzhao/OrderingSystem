package com.angzhao.dao;

import com.angzhao.entity.foodEntity;

import java.util.List;

public interface foodDao {

    int insertByFoods(foodEntity food);

    int deleteByFoods(String foodId);

    int updateByFoods(foodEntity food);

    List<foodEntity> queryAllFood();

    foodEntity queryByFoodId(String foodId);

    List<foodEntity> queryByFoodName(String foodName);
}
