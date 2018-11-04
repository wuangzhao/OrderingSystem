package com.angzhao.web;

import com.angzhao.entity.addressEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("address")
public class addressController {

    @RequestMapping("")
    public String addressPage(String userId, Model model) {
        List<addressEntity> addressList = new ArrayList<>();
        addressEntity address = new addressEntity();
        address.setAddress("xxx-xxx-xxx");
        address.setReceiver("吴xx");
        address.setTelPhone("131xxxxxxxx");

        addressEntity address1 = new addressEntity();
        address1.setAddress("xxx-xxx-xxx");
        address1.setReceiver("吴xx1");
        address1.setTelPhone("131xxxxxxx1");


        addressList.add(address);
        addressList.add(address1);

        model.addAttribute("addressList", addressList);
        return "address";
    }
}
