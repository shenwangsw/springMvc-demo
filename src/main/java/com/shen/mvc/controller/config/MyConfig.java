//package com.shen.mvc.controller.config;
//
//import com.sun.corba.se.spi.resolver.LocalResolver;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class MyConfig implements WebMvcConfigurer {
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        WebMvcConfigurer.super.addViewControllers(registry);
//    }
//
//    @Bean
//    public LocalResolver localResolver(){
//        return new MyLocalResolver();
//    }
//
//}
