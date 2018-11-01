package com.angzhao.web;

import com.angzhao.entity.foodEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("detail")
public class detailController {


    @RequestMapping()
    public String detailHome(Integer foodId, Model model){
        //TODO 数据库通过id查询出foodEntity
//       foodEntity food = foodDao.queryById(foodId);
        foodEntity food1 = new foodEntity();
        food1.setFoodDetails("abc");
        food1.setFoodImg("detail.png");
        food1.setFoodName("名字1");
        food1.setFoodPrice(12);
        food1.setFoodReserve(100);

        model.addAttribute("food", food1);
        return "detail";
    }
}
