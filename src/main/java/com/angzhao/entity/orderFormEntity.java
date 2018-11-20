package com.angzhao.entity;

import com.angzhao.model.orderFormDetailModel;

import java.util.List;

public class orderFormEntity {

    private String orderFormId;

    private String userId;

    private String status;

    private String createTime;

    private int totalPrice;

    private int totalAmount;

    private List<orderFormDetailModel> orderFormDetailList;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

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


    public List<orderFormDetailModel> getOrderFormDetailList() {

        return orderFormDetailList;
    }

    public void setOrderFormDetailList(List<orderFormDetailModel> orderFormDetailList) {
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
