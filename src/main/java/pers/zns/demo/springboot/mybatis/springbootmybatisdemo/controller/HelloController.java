package pers.zns.demo.springboot.mybatis.springbootmybatisdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-mybatis-demo
 * @description:
 * @author: zns
 * @create: 2022-05-30 17:04
 */
@RestController
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "helllooooo";
    }
}