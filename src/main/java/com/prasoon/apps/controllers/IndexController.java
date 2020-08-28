package com.prasoon.apps.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping({"/","/index",""})
    public String getIndexPage(){
        return "index";
    }

}
