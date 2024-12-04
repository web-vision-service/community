package com.example.communityservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/community-service/posts")
public class Controller {

    @GetMapping
    public String getPost(){
        return "Hello World";
    }

    @PostMapping
    public String postPost(){
        return "Hello World";
    }
}
