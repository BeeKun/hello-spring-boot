package com.lk.hellospringboot.controller;

import com.lk.hellospringboot.api.HelloRestService;
import com.lk.hellospringboot.model.Girl;
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
public class HelloController{

    @Value("${cupSize}")
    private String cupSize;

    @RequestMapping("/city")
    public String helloDemo(String id){
        System.out.println(111);
        return id;
    }

    @RequestMapping("/getGirl")
    public Girl getGirl() {
        Girl girl = new Girl();
        girl.setAge(12);
        girl.setId(2);
        girl.setName("xiaoming");
        return girl;
    }
}
