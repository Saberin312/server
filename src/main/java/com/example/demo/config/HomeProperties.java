package com.example.demo.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:42 2019/9/4
 *@Modified By:
 */

@Getter
@Setter
@Slf4j
@ToString

@Component
@ConfigurationProperties(prefix = "home")

@Entity
public class HomeProperties {

    @Id
    @GeneratedValue
    private Long id;


    private int age;
    private String name;
    private UUID uuid;



}
