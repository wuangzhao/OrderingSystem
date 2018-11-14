package com.angzhao.web;

import com.angzhao.entity.userEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "member", method = RequestMethod.GET)
public class memberController {



    @RequestMapping("")
    public String memberPage(Model model, HttpSession httpSession) {

        userEntity user = (userEntity) httpSession.getAttribute("user");
        model.addAttribute("userId", user.getUserId());
        model.addAttribute("username", user.getUserName());
        return "member";
    }
}
