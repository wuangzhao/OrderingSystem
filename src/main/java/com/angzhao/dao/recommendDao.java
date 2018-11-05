package com.angzhao.dao;

import com.angzhao.entity.foodEntity;

public interface recommendDao {

    int insertRecommendId(foodEntity foodEntity);

    int deleteRecommendId(foodEntity foodEntity);

    foodEntity queryRecommendId(foodEntity foodEntity);
}
