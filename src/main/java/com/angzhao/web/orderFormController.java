package com.angzhao.web;

import com.angzhao.entity.orderFormEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("order")
public class orderFormController {

    @RequestMapping("")
    public String orderPage(String userId, Model model) {
        List<orderFormEntity> orderFormList = new ArrayList<>();
        orderFormEntity orderFormEntity = new orderFormEntity();
        orderFormEntity.setOrderFormId("1234");
        orderFormEntity orderFormEntity1 = new orderFormEntity();
        orderFormEntity1.setOrderFormId("1234");

        orderFormList.add(orderFormEntity);
        orderFormList.add(orderFormEntity1);

        model.addAttribute("orderFormList", orderFormList);
        return "order";
    }
}
