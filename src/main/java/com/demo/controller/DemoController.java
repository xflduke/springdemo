package com.demo.controller;

import com.demo.pojo.Demo;
import com.demo.pojo.DemoForm;
import com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping({"/", "/index"})
    public String index(){
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("demoForm", new DemoForm());
        model.addAttribute("demoList", demoService.list());
        model.addAttribute("message", "list");
        return "list";
    }
}
