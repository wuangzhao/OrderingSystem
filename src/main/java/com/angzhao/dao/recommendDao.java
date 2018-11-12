package com.angzhao.dao;

import com.angzhao.entity.foodEntity;

import java.util.List;

public interface recommendDao {

    /**
     *
     * @param foodEntity
     * @return
     */

    int insertRecommendId(foodEntity foodEntity);

    int deleteRecommendId(foodEntity foodEntity);

    foodEntity queryRecommendId(foodEntity foodEntity);

    List<foodEntity> queryRecommendList();
}
