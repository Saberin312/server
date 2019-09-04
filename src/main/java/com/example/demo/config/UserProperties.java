package com.example.demo.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.UUID;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:13 2019/9/4
 *@Modified By:
 */

@Component
@Getter
@Setter
@Slf4j
@ToString
@ConfigurationProperties(prefix = "user")

public class UserProperties {
    private Long id;
    private int age;
    private String name;
    private UUID uuid;

    public static void main(String[] args) {
        UserProperties userProperties = new UserProperties();
        userProperties.getAge();
        userProperties.setAge(1);
        log.info(userProperties.toString());
//        userProperties.toString();
    }



}

