package com.angzhao.service;

import com.angzhao.entity.foodEntity;

import java.util.List;

public interface foodService {

    /**
     *
     * @param foodId
     * @param foodName
     * @param foodImg
     * @param foodPrice
     * @param foodReserve
     * @param foodDetails
     * @return
     */

    foodEntity insertFoodByFooId(String foodId,String foodName,String foodImg,int foodPrice,int foodReserve,String foodDetails);

    int deleteFoodByFoodId(String foodId);

    foodEntity updateFoodNameByFoodId(String foodId, String foodName);

    foodEntity updateFoodImgByFoodId(String foodId, String foodImg);

    foodEntity updateFoodPriceByFoodId(String foodId, int foodPrice);

    foodEntity updateFoodReserveByFoodId(String foodId, int foodReserve);

    foodEntity updateFoodDetailsByFoodId(String foodId, String foodDetails);

    foodEntity getByFoodId(String foodId);

    List<foodEntity> getFoodListByFoodName(String foodName);
}
