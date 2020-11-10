package com.tts.transitapp.controller;

import com.tts.transitapp.service.TransitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransitController {
    @Autowired
    TransitService transitService;

    @GetMapping("/")
    public String methodName(){
        transitService.run();
        return "index";
    }
}
