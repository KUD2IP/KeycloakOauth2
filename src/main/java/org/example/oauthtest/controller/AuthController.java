package org.example.oauthtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/home")
    public String auth() {
        return "Hello";
    }
}
