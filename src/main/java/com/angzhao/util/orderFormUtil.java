package com.angzhao.util;

public class orderFormUtil {

    public static String translate(String state) {
        switch (state) {
            case "2" : state = "订单成功"; break;
            case "1" : state = "未支付"; break;
            case "0" : state = "待评价"; break;
            case "-1" : state = "订单取消"; break;
        }
        return state;
    }
}
