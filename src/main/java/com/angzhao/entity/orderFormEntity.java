package com.angzhao.entity;

import java.util.List;

public class orderFormEntity {

    private String orderFormId;

    private String userId;

    private String status;

    private int totalPrice;

    private int totalAmount;

    private List<orderFormDetailEntity> orderFormDetailList;

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


    public List<orderFormDetailEntity> getOrderFormDetailList() {

        return orderFormDetailList;
    }

    public void setOrderFormDetailList(List<orderFormDetailEntity> orderFormDetailList) {
        this.orderFormDetailList = orderFormDetailList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
