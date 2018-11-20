package com.angzhao.entity;

import com.angzhao.model.foodAndAmountModel;

import java.util.List;

public class shoppingCartEntity {

    private String userId;

    private List<foodAndAmountModel> foodAndAmountModelList;

    private int totalPrice;

    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<foodAndAmountModel> getFoodAndAmountModelList() {
        return foodAndAmountModelList;
    }

    public void setFoodAndAmountModelList(List<foodAndAmountModel> foodAndAmountModelList) {
        this.foodAndAmountModelList = foodAndAmountModelList;
    }
}
