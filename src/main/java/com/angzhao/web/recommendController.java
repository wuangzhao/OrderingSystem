package com.angzhao.web;

import com.angzhao.entity.foodEntity;
import com.angzhao.service.foodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("recommend")
public class recommendController {

    @Autowired
    foodService foodService;


    @RequestMapping("")
    public String recommendPage(Model model) {

        foodEntity food1 = foodService.getByFoodId("fd_1000a001");
        foodEntity food2 = foodService.getByFoodId("fd_1000a002");
        foodEntity food3 = foodService.getByFoodId("fd_1000a003");
        foodEntity food4 = foodService.getByFoodId("fd_1000a004");

        List<foodEntity> foodEntityList = new ArrayList<>();

        foodEntityList.add(food1);

        foodEntityList.add(food2);

        foodEntityList.add(food3);

        foodEntityList.add(food4);

        model.addAttribute("foods", foodEntityList);

        return "recommend";
    }
}
