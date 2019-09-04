package com.example.demo.controller;

import com.example.demo.config.HomeProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 13:31 2019/9/4
 *@Modified By:
 */

@RestController
@Slf4j
public class HelloWorld {
    @RequestMapping("/HELLOWORLD")

    public String helloWorld() {
        return "HELLO WORLD!";


    }

    public void helloWorldLogTest() {
        log.info("Hello World!");
    }

    @Autowired
    private HomeProperties homeProperties;
    @Value("${home.age}")
    private int age;

    @RequestMapping("/getAge")
    public int getAge() {
        return age;
    }


    @RequestMapping("/getHome")
    public HomeProperties getHomeProperties() {
        System.out.println(homeProperties);
        return homeProperties;
    }


}
