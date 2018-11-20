package com.angzhao.model;

import com.angzhao.entity.foodEntity;

public class foodAndAmountModel {

    private com.angzhao.entity.foodEntity foodEntity;

    private int foodAmount;

    public com.angzhao.entity.foodEntity getFoodEntity() {
        return foodEntity;
    }

    public void setFoodEntity(com.angzhao.entity.foodEntity foodEntity) {
        this.foodEntity = foodEntity;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }
}
