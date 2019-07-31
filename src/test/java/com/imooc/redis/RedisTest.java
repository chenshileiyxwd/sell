package com.imooc.redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName com.imooc.redis.RedisTest
 * @Description redis测试类
 * @Author mrleier
 * @Date 2019/7/31 23:30
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RedisTest {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void testInsert() {
//        redisTemplate.opsForValue().set("myname", "陈世磊");
        String myname = redisTemplate.opsForValue().get("myname");
        System.out.println("myname = " + myname);
    }

}
