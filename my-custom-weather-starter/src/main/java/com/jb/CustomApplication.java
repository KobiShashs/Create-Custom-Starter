package com.jb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kobis on 15 Jul, 2023
 */
@Configuration
@ComponentScan(basePackages = "com.jb")
public class CustomApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CustomApplication.class);
    }
}
