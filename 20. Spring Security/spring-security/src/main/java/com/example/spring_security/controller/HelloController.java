package com.example.spring_security.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest request) {
        // to get session id, saved in cookies during login
        // and used to identify the user in subsequent requests
        // session id is unique for each user
        // and is used to maintain the state of the user
        // once the session is over, the session id is deleted
        // and the user is logged out
        return "Hello World "+request.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "Telusko "+request.getSession().getId();
    }
}