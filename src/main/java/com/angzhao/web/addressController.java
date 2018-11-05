package com.angzhao.web;

import com.angzhao.entity.addressEntity;
import com.angzhao.service.addressInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("address")
public class addressController {

    @Autowired
    addressInfoService addressInfoService;

    @RequestMapping("")
    public String addressPage(String userId, Model model) {
        List<addressEntity> addressList = addressInfoService.getAddressInfoListByUserId(userId);
        model.addAttribute("addressList", addressList);
        return "address";
    }
}
