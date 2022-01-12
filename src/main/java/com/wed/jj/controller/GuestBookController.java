package com.wed.jj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestBookController {
    @RequestMapping("/")
    public String index() {
        return "Hello!";
    }
}
