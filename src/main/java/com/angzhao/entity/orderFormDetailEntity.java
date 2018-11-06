package com.angzhao.entity;

public class orderFormDetailEntity {

    private String foodId;

    private String foodName;

    private String foodImg;

    private int totalPrice;

    private int foodPrice;

    private int amount;

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(String foodImg) {
        this.foodImg = foodImg;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "orderFormDetailEntity{" +
                "foodId='" + foodId + '\'' +
                ", foodName='" + foodName + '\'' +
                ", foodImg='" + foodImg + '\'' +
                ", foodPrice='" + foodPrice + '\'' +
                ", amount=" + amount +
                '}';
    }
}
