package com.angzhao.web;

import com.angzhao.entity.foodEntity;
import com.angzhao.entity.homeImgEntity;
import com.angzhao.entity.orderFormEntity;
import com.angzhao.entity.userEntity;
import com.angzhao.service.*;
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

    @Autowired
    recommendService recommendService;

    @Autowired
    homeImgService homeImgService;

    @Autowired
    userService userService;

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
        return "admin/success";
    }

    @RequestMapping(value = "foodUpload", method = RequestMethod.GET)
    public String foodUploadPage() {
        return "admin/foodUpload";
    }

    @RequestMapping(value = "foodUpload", method = RequestMethod.POST)
    public String foodUploadPage(foodEntity foodEntity, MultipartFile foodImgFile, HttpSession session) {
        if (foodImgFile.isEmpty()) {
            return "admin/fail";
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
            return "admin/success";
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
            return "admin/success";
        }
        return "admin/fail";
    }

    @RequestMapping(value = "recommend", method = RequestMethod.GET)
    public String recommend(Model model) {
        List<foodEntity> foodEntityList = recommendService.getRecommendList();
        List<foodEntity> notCommendList = recommendService.getNotRecommendList();
        model.addAttribute("foodList", foodEntityList);
        model.addAttribute("notCommendList", notCommendList);
        return "admin/recommend";
    }

    @RequestMapping(value = "recommendDelete", method = RequestMethod.GET)
    public String recommendDelete(String foodId) {
        foodEntity foodEntity = new foodEntity();
        foodEntity.setFoodId(foodId);
        if (recommendService.deleteRecommendFood(foodEntity) == 1) {
            return "admin/success";
        } else {
            return "admin/fail";
        }
    }

    @RequestMapping(value = "recommendAdd", method = RequestMethod.GET)
    public String recommendAdd(String foodId) {
        foodEntity foodEntity = new foodEntity();
        foodEntity.setFoodId(foodId);
        if (recommendService.insertRecommendFood(foodEntity) != null) {
            return "admin/success";
        } else {
            return "admin/fail";
        }
    }

    @RequestMapping(value = "slideShow", method = RequestMethod.GET)
    public String slideShow(Model model) {
        List<homeImgEntity> homeImgEntityList = homeImgService.getAllImgName();
        model.addAttribute("homeImgEntityList", homeImgEntityList);
        return "admin/slideShow";
    }

    @RequestMapping(value = "slideShowDelete", method = RequestMethod.GET)
    public String slideShowDelete(String picId, HttpSession session) {
        String foodFileName = foodService.getByFoodId(picId).getFoodImg();
        String picPath = session.getServletContext().getRealPath("/images/home/");
        File file = new File(picPath+foodFileName);
        if (homeImgService.deleteHomeImg(picId) == 1) {
            file.delete();
            return "admin/success";
        }
        return "admin/fail";
    }


    @RequestMapping(value = "slideShowUpload", method = RequestMethod.POST)
    public String slideShowUpload(MultipartFile imgFile, HttpSession session) {
        if (imgFile.isEmpty()) {
            return "admin/fail";
        } else {
            String originalFileName = imgFile.getOriginalFilename();
            String foodId = UUID.randomUUID().toString();
            String newFileName = foodId+originalFileName.substring(originalFileName.lastIndexOf("."));
            String picPath = session.getServletContext().getRealPath("/images/home/");
            File newFile = new File(picPath+newFileName);
            try {
                imgFile.transferTo(newFile);
                homeImgService.insertHomeImg(newFileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "admin/success";
        }

    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        return "admin/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginCheck(userEntity user, HttpSession session) {
        userEntity userGet = userService.getUserByUserTel(user.getUserTel());
        if (userGet != null && userGet.getUserGroup() == 2 && userGet.getUserPassword().equals(user.getUserPassword())) {
            session.setAttribute("user", userGet);
            return "redirect:../admin";
        } else {
            return "admin/login";
        }
    }
}
