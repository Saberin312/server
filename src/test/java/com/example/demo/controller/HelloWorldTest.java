package com.example.demo.controller;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.Assert.*;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 13:36 2019/9/4
 *@Modified By:
 */
@Slf4j
public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        assertEquals("HELLO WORLD!",new HelloWorld().helloWorld());
        log.info("Hello World!");
    }

}