package com.example.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static org.junit.Assert.*;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 15:52 2019/9/4
 *@Modified By:
 */

@Component
@Slf4j
public class HomePropertiesTest {


    @Value("${Home.id}")
    private Long id;


    @Value("${Home.age}")
    private int age;

    @Value("${Home.name}")
    private String name;


//    HomeProperties homeProperties = new HomeProperties();
    @Test
    public void setId() {
        this.id = id;
        assertEquals(this.id,"123213");
//        assertEquals(id,);


    }

    @Test
    public void setAge() {
        this.age = age;
//        assertEquals(this.age, 13);
        assertEquals(age, 13);
    }

    @Test
    public void setName() {
        this.name = name;

        assertEquals(this.name,"ffasdfasdf");
    }



//    @Test
//    public Long getId() {
//        return id;
//    }
//
//    @Test
//    public int getAge() {
//        return age;
//    }
//
//    @Test
//    public String getName() {
//        return name;
//    }

//    @Test
//    public String toString() {
//        return
//    }
}