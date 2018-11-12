package com.angzhao.dao;

import com.angzhao.entity.foodEntity;

public interface salesDao {


    /**
     *
     * @param foodEntity
     * @return
     */

    int insertSalesId(foodEntity foodEntity);

    int deleteSalesId(foodEntity foodEntity);

    foodEntity querySalesId(foodEntity foodEntity);

}
