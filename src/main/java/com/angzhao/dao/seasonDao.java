package com.angzhao.dao;

import com.angzhao.entity.foodEntity;

public interface seasonDao {


    /**
     *
     * @param foodEntity
     * @return
     */

    int insertSeasonId(foodEntity foodEntity);

    int deleteSeasonId(foodEntity foodEntity);

    foodEntity querySeasonId(foodEntity foodEntity);

}
