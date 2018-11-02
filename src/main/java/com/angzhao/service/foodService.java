package com.angzhao.service;

import com.angzhao.entity.foodEntity;

public interface foodService {

    /**
     * 通过Id查询食物
     * @param foodId
     * @return
     */
    foodEntity getByFoodId(String foodId);

}
