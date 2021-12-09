package com.fstbr.demo.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RedisCache {

    @Autowired
    RedisUtils redisUtils;

    @PostConstruct
    public void init() {
//        if(!redisUtils.hasKey("tom")) {
//            redisUtils.set("tom", "tomy");
//        }
    }
}