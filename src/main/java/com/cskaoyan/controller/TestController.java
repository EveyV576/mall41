package com.cskaoyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sywork1605@163.com
 * @description
 * @since 2022/06/23 20:51
 */
@Controller
public class TestController {

    @RequestMapping("shenyu")
    public void Shenyu(){
        System.out.println("Shenyu");
    }
}
