package pers.zns.demo.springboot.mybatis.springbootmybatisdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @program: springboot-mybatis-demo
 * @description:
 * @author: zns
 * @create: 2022-05-30 17:04
 */
@Controller
public class HelloController {

    @PostMapping("/hello")
    public String hello() {
        return "helllooooo";
    }
}