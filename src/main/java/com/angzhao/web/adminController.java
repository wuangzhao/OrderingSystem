package com.angzhao.web;

import com.angzhao.entity.foodEntity;
import com.angzhao.entity.orderFormEntity;
import com.angzhao.service.foodService;
import com.angzhao.service.orderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("admin")
public class adminController {

    @Autowired
    orderFormService orderFormService;

    @Autowired
    foodService foodService;

    @RequestMapping
    public String adminPage() {
        return "/admin/admin";
    }

    @RequestMapping("order")
    public String adminOrder(Model model) {
        List<orderFormEntity> orderFormList = orderFormService.getAdminOrderForm();
        List<orderFormEntity> waitPayOrderFormList = orderFormService.getNotSuccessAdminOrderForm();
        List<orderFormEntity> waitCommentOrderFormList = orderFormService.getSuccessAdminOrderForm();
        model.addAttribute("orderFormList", orderFormList);
        model.addAttribute("waitPayOrderFormList", waitPayOrderFormList);
        model.addAttribute("waitCommentOrderFormList", waitCommentOrderFormList);
        return "/admin/adminOrder";
    }

    @RequestMapping(value = "addToAdminOrder")
    public String payOrderForm(@RequestParam("orderFormId") String orderFormId) {
        orderFormService.insertAdminOrder(orderFormId);
        return "success";
    }

    @RequestMapping(value = "foodUpload", method = RequestMethod.GET)
    public String foodUploadPage() {
        return "admin/foodUpload";
    }

    @RequestMapping(value = "foodUpload", method = RequestMethod.POST)
    public String foodUploadPage(foodEntity foodEntity, MultipartFile foodImgFile, HttpSession session) {
        if (foodImgFile.isEmpty()) {
            return "fail";
        } else {
            String originalFileName = foodImgFile.getOriginalFilename();
            String foodId = UUID.randomUUID().toString();
            String newFileName = foodId+originalFileName.substring(originalFileName.lastIndexOf("."));
            foodEntity.setFoodImg(newFileName);
            foodEntity.setFoodId(foodId);
            foodService.insertFood(foodEntity);
            String picPath = session.getServletContext().getRealPath("/images/foodImg/");
            File newFile = new File(picPath+newFileName);
            try {
                foodImgFile.transferTo(newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "success";
        }

    }

    @RequestMapping(value = "foodDelete", method = RequestMethod.GET)
    public String foodDeletePage(Model model) {
        List<foodEntity> foodEntityList = foodService.getAllFoodList();
        model.addAttribute("foodList", foodEntityList);
        return "admin/foodDelete";
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String deleteFood(String foodId, HttpSession session) {
        String foodFileName = foodService.getByFoodId(foodId).getFoodImg();
        String picPath = session.getServletContext().getRealPath("/images/foodImg/");
        File file = new File(picPath+foodFileName);
        if (foodService.deleteFoodByFoodId(foodId) == 1){
            file.delete();
            return "success";
        }
        return "fail";
    }
}
