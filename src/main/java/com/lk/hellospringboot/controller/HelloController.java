package com.lk.hellospringboot.controller;

import com.lk.hellospringboot.api.HelloRestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author likun
 * @version V1.0
 * @Title: com.lk.hellospringboot.controller
 * @date 2018/3/29 14:56
 */
@RestController
@RequestMapping("/hello")
public class HelloController implements HelloRestService {

    @Value("${cupSize}")
    private String cupSize;

    @Override
    @RequestMapping("/city")
    @Transactional
    public String helloDemo(String id){
        return id;
    }
}
