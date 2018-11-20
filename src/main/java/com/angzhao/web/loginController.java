package com.angzhao.web;

import com.angzhao.entity.userEntity;
import com.angzhao.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("login")
public class loginController {

    @Autowired
    userService userService;

    @RequestMapping("")
    public String login() {
        return "login";
    }


    @RequestMapping(value = "check", method = RequestMethod.POST)
    public String loginCheck(userEntity user, HttpSession session) {
        userEntity userGet = userService.getUserByUserTel(user.getUserTel());
        if (userGet != null && userGet.getUserPassword().equals(user.getUserPassword())) {
            session.setAttribute("user", userGet);
            return "redirect:/member";
        } else {
            return "redirect:/login";
        }
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String showRegister() {
        return "register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String processRegister(userEntity user) {
        userService.insertUser(user);
        return "redirect:/login";
    }
}
