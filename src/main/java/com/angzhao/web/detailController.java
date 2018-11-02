package com.angzhao.web;

import com.angzhao.entity.foodEntity;
import com.angzhao.service.foodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("detail")
public class detailController {

    @Autowired
    foodService foodService;

    @RequestMapping()
    public String detailHome(String foodId, Model model){
        foodEntity food = foodService.getByFoodId(foodId);
        model.addAttribute("food", food);
        return "detail";
    }
}
