package com.angzhao.web;

import com.angzhao.entity.foodEntity;
import com.angzhao.entity.homeImgEntity;
import com.angzhao.service.foodService;
import com.angzhao.service.homeImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/home")
public class homeController {

    @Autowired
    foodService foodService;

    @Autowired
    homeImgService homeImgService;

    @RequestMapping("")
    public String showPic(Model model) {
        List<homeImgEntity> picList = homeImgService.getAllImgName();

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
        model.addAttribute("name", picList);
        return "index";
    }


    @RequestMapping("search")
    public void search(ModelAndView model) {

    }
}
