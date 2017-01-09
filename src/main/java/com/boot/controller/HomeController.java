package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Major on 9/01/2017.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Das Boot, reporting for duty!";
    }
}
