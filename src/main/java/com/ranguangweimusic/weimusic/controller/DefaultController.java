package com.ranguangweimusic.weimusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: rgw
 * @Date: 2023/3/8 - 03 - 08 - 20:18
 */
@RestController
@RequestMapping("/hello")
public class DefaultController {
    @GetMapping
    public String sayHello(){
        return "欢迎光临";
    }
}
