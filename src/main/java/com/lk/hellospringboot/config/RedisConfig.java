package com.lk.hellospringboot.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * redis缓存配置文件
 * @author likun
 * @version V1.0
 * @Title: com.lk.hellospringboot.config
 * @date 2018/4/13 17:55
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport{

    /**
     * 缓存key生成
     * @return
     */
    @Bean
    @Override
    public KeyGenerator keyGenerator() {
        return (target, method, params) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(target.getClass().getName());
            sb.append(method.getName());
            for (Object obj : params) {
                sb.append(obj.toString());
            }
            return sb.toString();
        };
    }
}
