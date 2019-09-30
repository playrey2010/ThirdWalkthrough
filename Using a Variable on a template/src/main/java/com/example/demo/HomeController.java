package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("var1", "This is var 1.");
        model.addAttribute("var2", "This is var 2.");
        return "index";
    }

    @RequestMapping("/1")
    public String index1(Model model) {
        model.addAttribute("var1", "This is var 1.");
        model.addAttribute("var2", "This is var 2.");
        return "index";
    }

}
