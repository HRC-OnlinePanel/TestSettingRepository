package com.testgroup.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController {
    

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Demo Home");
        model.addAttribute("message", "Thymeleaf 템플릿이 정상 동작합니다 🎉");
        return "index"; // templates/index.html 을 찾음
    }
    @GetMapping("/about")
    public String about() {
        return "about"; // templates/about.html
    }
}
