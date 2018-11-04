package com.angzhao.web;

import com.angzhao.entity.foodEntity;
import com.angzhao.service.foodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("search")
public class searchController {

    @Autowired
    foodService foodService;

    @RequestMapping("")
    public String search(String text, Model model) {
        List<foodEntity> foodList = foodService.getFoodListByFoodName(text);
        model.addAttribute("foodList", foodList);
        return "search";
    }
}
