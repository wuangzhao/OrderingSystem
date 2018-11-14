package com.angzhao.web;

import com.angzhao.entity.userEntity;
import com.angzhao.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("login")
public class loginController {

    @Autowired
    com.angzhao.service.userService userService;

    @RequestMapping("")
    public String login() {
        return "login";
    }


    @RequestMapping("check")
    public String loginCheck(userEntity user, HttpSession session) {
        userEntity userGet = userService.getUserByUserName(user.getUserName());
        System.out.println(userGet.getUserPassword());
        System.out.println(userGet.getUserId());
        System.out.println(userGet.getUserName());
        if (userGet != null || userGet.getUserPassword().equals(user.getUserPassword())) {
            session.setAttribute("user", userGet);
            return "redirect:/member";
        } else {
            return "login";
        }
    }
}
