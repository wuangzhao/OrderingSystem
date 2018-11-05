package com.angzhao.enums;

public enum orderFormEnums {

    SUCCESS(1, "购"), HAS_SOLD(0, "已出售"), INNER_ERROR(-1, "系统异常"), ILLEGAL(-2, "非法操作");

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
