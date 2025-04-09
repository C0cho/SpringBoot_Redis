package com.cc.springbootredistest;

import com.cc.springbootredistest.mapper.CacheMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringbootredistestApplicationTests {

    @Resource
    CacheMapper mapper;

    @Test
    void contextLoads() {
        mapper.getid();
        mapper.getid();
        mapper.getid();

    }

}
