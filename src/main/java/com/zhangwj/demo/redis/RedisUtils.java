package com.zhangwj.demo.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtils {

    private RedisTemplate<Object,Object> redisTemplate;



}
