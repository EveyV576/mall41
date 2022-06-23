package com.cskaoyan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author stone
 * @date 2022/06/22 10:10
 */
@Configuration
@ComponentScan(value = "com.cskaoyan",excludeFilters = @ComponentScan.Filter({Controller.class, EnableWebMvc.class}))
public class SpringConfiguration {
}
