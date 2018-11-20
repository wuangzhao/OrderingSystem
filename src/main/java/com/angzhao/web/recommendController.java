package com.angzhao.web;

import com.angzhao.entity.foodEntity;
import com.angzhao.service.foodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("recommend")
public class recommendController {

    @Autowired
    foodService foodService;

    @RequestMapping("")
    public String recommendPage(Model model) {


        List<foodEntity> foodEntityList = foodService.getAllFoodList();

        model.addAttribute("foods", foodEntityList);

        return "recommend";
    }
}
