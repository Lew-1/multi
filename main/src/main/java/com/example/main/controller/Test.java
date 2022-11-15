package com.example.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luzhonghe
 * @date 2022/11/14
 */
@RestController
@RequestMapping("/main")
public class Test {
    
    @GetMapping("/main")
    public String main() {
        return "main";
    }
    
}
