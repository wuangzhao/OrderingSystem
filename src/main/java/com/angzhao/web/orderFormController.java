package com.angzhao.web;

import com.angzhao.entity.orderFormEntity;
import com.angzhao.service.orderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("order")
public class orderFormController {

    @Autowired
    orderFormService orderFormService;

    @RequestMapping("")
    public String orderPage(String userId, Model model) {
        List<orderFormEntity> orderFormList = orderFormService.getOrderFormByUserId(userId);
        model.addAttribute("orderFormList", orderFormList);
        return "order";
    }
}
