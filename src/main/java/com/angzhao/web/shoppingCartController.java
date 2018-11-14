package com.angzhao.web;

import com.angzhao.entity.shoppingCart;
import com.angzhao.entity.shoppingCartDetail;
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
        shoppingCart shoppingCart = shoppingCartService.getShoppingCartListByUserId(userId);
        model.addAttribute("shoppingCart", shoppingCart);
        return "shoppingCart";
    }

    @RequestMapping("add")
    public String addToShoppingCart(String foodId, HttpSession session) {
        userEntity user = (userEntity) session.getAttribute("user");
        shoppingCartDetail shoppingCartDetail = new shoppingCartDetail();
        shoppingCartDetail.setUserId(user.getUserId());
        shoppingCartDetail.setFoodId(foodId);
        shoppingCartDetail.setFoodAmount(1);
        shoppingCartService.addShoppingCartDetail(shoppingCartDetail);
        return "redirect:/shoppingCart";
    }

    @RequestMapping("pay")
    public String pay(HttpSession session) {
        userEntity user = (userEntity) session.getAttribute("user");
        shoppingCartService.payment(user.getUserId());
        return "redirect:/order";
    }

}
