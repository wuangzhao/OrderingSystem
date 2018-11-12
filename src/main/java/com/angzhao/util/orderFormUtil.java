package com.angzhao.util;

public class orderFormUtil {

    public static String translate(String state) {
        switch (state) {
            case "2" : return "订单成功";
            case "1" : return "未支付";
            case "-1" : return "订单取消";
        }
        return "";
    }
}
