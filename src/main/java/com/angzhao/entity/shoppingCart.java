package com.angzhao.entity;

import java.util.List;

public class shoppingCart {

    private String userId;

    private List<foodAndAmount> foodAndAmountList;

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

    public List<foodAndAmount> getFoodAndAmountList() {
        return foodAndAmountList;
    }

    public void setFoodAndAmountList(List<foodAndAmount> foodAndAmountList) {
        this.foodAndAmountList = foodAndAmountList;
    }
}
