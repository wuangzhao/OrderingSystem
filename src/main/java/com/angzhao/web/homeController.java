package com.angzhao.web;

import com.angzhao.entity.foodEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/home")
public class homeController {


    @RequestMapping("")
    public String showPic(Model model) {
        List<String> picList = new ArrayList<>();
        File picPath = new File("/Users/angzhao/Desktop/Ordering/src/main/webapp/images/home");
        File[] showPicList = picPath.listFiles();
        for (int i = 0; i < showPicList.length; i++) {
            picList.add(showPicList[i].getName());
        }

        foodEntity food1 = new foodEntity();
        food1.setFoodDetails("abc");
        food1.setFoodImg("p.png");
        food1.setFoodName("名字1");
        food1.setFoodPrice(12);
        food1.setFoodReserve(100);
        food1.setFoodId("10000");

        foodEntity food2 = new foodEntity();
        food2.setFoodDetails("abc");
        food2.setFoodImg("p1.png");
        food2.setFoodName("名字2");
        food2.setFoodPrice(22);
        food2.setFoodReserve(100);
        food2.setFoodId("10001");

        foodEntity food3 = new foodEntity();
        food3.setFoodDetails("abc");
        food3.setFoodImg("p2.png");
        food3.setFoodName("名字3");
        food3.setFoodPrice(22);
        food3.setFoodReserve(100);
        food3.setFoodId("10001");

        foodEntity food4 = new foodEntity();
        food4.setFoodDetails("abc");
        food4.setFoodImg("p3.png");
        food4.setFoodName("名字4");
        food4.setFoodPrice(22);
        food4.setFoodReserve(100);
        food4.setFoodId("10001");


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
