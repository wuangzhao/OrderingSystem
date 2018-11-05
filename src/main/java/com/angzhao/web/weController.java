package com.angzhao.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("we")
public class weController {

    @RequestMapping()
    public String wePage() {
        return "we";
    }
}
