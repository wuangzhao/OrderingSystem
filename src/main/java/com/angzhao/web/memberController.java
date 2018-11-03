package com.angzhao.web;

import com.angzhao.entity.userEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "member", method = RequestMethod.GET)
public class memberController {

    @RequestMapping("")
    public String memberPage(Model model) {
        userEntity user = new userEntity();
        user.setUsername("123");
        model.addAttribute("username", user.getUsername());
        return "member";
    }
}