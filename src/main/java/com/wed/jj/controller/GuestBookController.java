package com.wed.jj.controller;

import com.wed.jj.model.GuestBook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@RequestMapping("guestbook")
@RestController
public class GuestBookController {
    @RequestMapping("/")
    public String index() {
        return "Hello!";
    }
    @GetMapping("/info")
    public GuestBook info() {
        return new GuestBook(1, "히히", "10.10.50.0", "잘!!!하자", new Date());
    }

    @GetMapping("/list")
    public ArrayList<GuestBook> memberTest2(){
        return new ArrayList(Arrays.asList(
                new GuestBook(1, "Wickies", "10.10.50.0", "제주", new Date()),
                new GuestBook(2, "마동석", "10.10.50.0", "전주", new Date()),
                new GuestBook(3, "조승우", "10.10.50.0", "무주", new Date()),
                new GuestBook(4, "박보영", "10.10.50.0", "진주", new Date()),
                new GuestBook(5, "엄복동", "10.10.50.0", "상주", new Date())
        ));
    }
    
}
