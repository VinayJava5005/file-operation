package com.fileoperation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class SFDCController {
    @RequestMapping(method = RequestMethod.GET)
    public String sendRedirectHome(ModelMap model) {
        model.addAttribute("message", "File Uploader");
        return "home";
    }
}