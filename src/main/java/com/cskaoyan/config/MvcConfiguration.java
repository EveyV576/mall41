package com.cskaoyan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan("com.cskaoyan.controller")
public class MvcConfiguration implements WebMvcConfigurer {

    // default-servlet-handler
    /*@Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }*/

    // @Override
    // public void addResourceHandlers(ResourceHandlerRegistry registry) {
    //     //                                      mapping                         location
    //     registry.addResourceHandler("/pic/**").addResourceLocations("classpath:/");
    //     registry.addResourceHandler("/jpg/**").addResourceLocations("/");
    //     registry.addResourceHandler("/png/**").addResourceLocations("file:D:\\spring/");
    // }
}
