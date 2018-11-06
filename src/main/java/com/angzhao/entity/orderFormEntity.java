package com.angzhao.entity;

import java.util.List;

public class orderFormEntity {

    private String orderFormId;

    private String userId;

    private int status;

    private int totalPrice;

    private int totalAmount;


    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    private List<orderFormDetailEntity> orderFormDetailList;


    public List<orderFormDetailEntity> getOrderFormDetailList() {

        return orderFormDetailList;
    }

    public void setOrderFormDetailList(List<orderFormDetailEntity> orderFormDetailList) {
        this.orderFormDetailList = orderFormDetailList;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getOrderFormId() {
        return orderFormId;
    }

    public void setOrderFormId(String orderFormId) {
        this.orderFormId = orderFormId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    @Override
    public String toString() {
        return "orderFormEntity{" +
                "orderFormId='" + orderFormId + '\'' +
                ", userId='" + userId + '\'' +
                ", status=" + status +
                ", totalPrice=" + totalPrice +
                ", totalAmount=" + totalAmount +
                ", orderFormDetailList=" + orderFormDetailList +
                '}';
    }
}
