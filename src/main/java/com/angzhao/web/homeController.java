package com.angzhao.web;

import com.angzhao.entity.foodEntity;
import com.angzhao.entity.homeImgEntity;
import com.angzhao.service.foodService;
import com.angzhao.service.homeImgService;
import com.angzhao.service.recommendService;
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

    @Autowired
    recommendService recommendService;

    @RequestMapping("")
    public String showPic(Model model) {
        List<homeImgEntity> picList = homeImgService.getAllImgName();

        List<foodEntity> foodEntityList = recommendService.getRecommendList();


        model.addAttribute("foods", foodEntityList);
        model.addAttribute("name", picList);
        return "index";
    }


    @RequestMapping("search")
    public void search(ModelAndView model) {

    }
}
