package com.angzhao.web;

import com.angzhao.entity.orderFormEntity;
import com.angzhao.service.orderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("order")
public class orderFormController {

    @Autowired
    orderFormService orderFormService;

    @RequestMapping("")
    public String orderPage(String userId, Model model) {
        List<orderFormEntity> orderFormList = orderFormService.getOrderFormByUserId(userId);
        List<orderFormEntity> waitPayOrderFormList = orderFormService.getWaitPayOrderFormByUserId(userId);
        List<orderFormEntity> waitCommentOrderFormList = orderFormService.getWaitCommentOrderFormByUserId(userId);
        model.addAttribute("orderFormList", orderFormList);
        model.addAttribute("waitPayOrderFormList", waitPayOrderFormList);
        model.addAttribute("waitCommentOrderFormList", waitCommentOrderFormList);
        return "order";
    }

    @RequestMapping(value = "cancel", method = RequestMethod.POST)
    public String cancelOrderForm(String orderFormId) {
        orderFormEntity orderForm = orderFormService.getOrderForm(orderFormId);
        if (orderFormService.cancelOrderFormByOrderId(orderForm) != null) {
            return "success";
        } else {
            return "fail";
        }

    }
}
