package com.lk.hellospringboot.api;

import org.springframework.stereotype.Service;

/**
 * @author likun
 * @version V1.0
 * @Title: com.lk.hellospringboot.api
 * @date 2018/4/12 19:33
 */
@Service
public interface HelloRestService {

    String helloDemo(String id);
}
