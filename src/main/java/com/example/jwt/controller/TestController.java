package com.example.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/profile")
    public String profile() {
        return "Welcome, you are logged in ✅";
    }

    // 🔐 ADMIN API
    @GetMapping("/admin/data")
    public String admin() {
        return "Admin access only 🔐";
    }

    // 👤 USER API
    @GetMapping("/user/data")
    public String user() {
        return "User access only 👤";
    }
}