package com.angzhao.dao;

import com.angzhao.entity.foodEntity;

import java.util.List;

public interface recommendDao {

    int insertRecommendId(foodEntity foodEntity);

    int deleteRecommendId(foodEntity foodEntity);

    foodEntity queryRecommendId(foodEntity foodEntity);

    List<foodEntity> queryRecommendList();

    List<foodEntity> queryNotRecommendList();
}
