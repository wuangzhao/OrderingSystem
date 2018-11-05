package com.angzhao.enums;

public enum orderFormEnums {

    SUCCESS(1, "订单完成"), WAIT_PAID(0, "待付款"), WAIT_ASSESS(-1, "等待评价"),
    INNER_ERROR(-1, "系统异常"), ILLEGAL(-2, "非法操作");

    private int state;

    private String stateInfo;

    orderFormEnums(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

}
