package com.angzhao.web;

import com.angzhao.entity.shoppingCartEntity;
import com.angzhao.model.shoppingCartDetailModel;
import com.angzhao.entity.userEntity;
import com.angzhao.service.orderFormService;
import com.angzhao.service.shoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "shoppingCart")
public class shoppingCartController {

    @Autowired
    shoppingCartService shoppingCartService;

    @Autowired
    orderFormService orderFormService;


    @RequestMapping
    public String shoppingCartList(HttpSession session, Model model) {
        userEntity user = (userEntity) session.getAttribute("user");
        String userId = user.getUserId();
        shoppingCartEntity shoppingCartEntity = shoppingCartService.getShoppingCartListByUserId(userId);
        model.addAttribute("shoppingCart", shoppingCartEntity);
        return "shoppingCart";
    }

    @RequestMapping("add")
    public String addToShoppingCart(String foodId, HttpSession session) {
        userEntity user = (userEntity) session.getAttribute("user");
        shoppingCartDetailModel shoppingCartDetailModel = new shoppingCartDetailModel();
        shoppingCartDetailModel.setUserId(user.getUserId());
        shoppingCartDetailModel.setFoodId(foodId);
        shoppingCartDetailModel.setFoodAmount(1);
        shoppingCartService.addShoppingCartDetail(shoppingCartDetailModel);
        return "redirect:/shoppingCart";
    }

    @RequestMapping("pay")
    public String pay(HttpSession session) {
        userEntity user = (userEntity) session.getAttribute("user");
        if (shoppingCartService.payment(user.getUserId())) {
            return "redirect:/order";
        } else {
            return "redirect:/shoppingCart";
        }
    }
}
