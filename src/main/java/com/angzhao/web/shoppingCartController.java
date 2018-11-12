package com.angzhao.web;

import com.angzhao.entity.shoppingCart;
import com.angzhao.service.shoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "shoppingCart")
public class shoppingCartController {

    @Autowired
    shoppingCartService shoppingCartService;


    @RequestMapping
    public String shoppingCartList(String userId, Model model) {
        shoppingCart shoppingCart = shoppingCartService.getShoppingCartListByUserId(userId);
        model.addAttribute("shoppingCart", shoppingCart);
        return "shoppingCart";
    }
}
