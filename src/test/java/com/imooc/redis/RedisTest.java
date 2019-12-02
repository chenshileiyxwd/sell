package com.imooc.redis;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
    public void testChannel() {
        redisTemplate.convertAndSend("csl_channel", "my first channel");
    }


    @Test
    public void testInsert() throws JSONException {
//        redisTemplate.opsForValue().set("myname", "陈世磊");
        redisTemplate.delete("te    }\nstname");

    }

    @Test
    public void usualTest() throws InterruptedException {
        Boolean aBoolean = redisTemplate.opsForValue().setIfAbsent("name", "陈世磊");


        System.out.println("aBoolean = " + aBoolean);

        redisTemplate.opsForValue().set("name", "chenshilei");
        String name = redisTemplate.opsForValue().get("name");
        System.out.println("name = " + name);

        redisTemplate.opsForValue().set("ccc", "timename", 3, TimeUnit.SECONDS);
        Thread.sleep(2000);
        System.out.println("redisTemplate.opsForValue().get(\"ccc\") = " + redisTemplate.opsForValue().get("ccc"));
        Thread.sleep(996);
        System.out.println("redisTemplate.opsForValue().get(\"ccc\") = " + redisTemplate.opsForValue().get("ccc"));
        Thread.sleep(4);
        System.out.println("redisTemplate.opsForValue().get(\"ccc\") = " + redisTemplate.opsForValue().get("ccc"));

    }

    /**
     * redis hash操作
     */
    @Test
    public void testRedisInsertAndGet() {
        redisTemplate.delete("map");
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("key1", "val1");
        stringStringHashMap.put("key2", "val2");
        stringStringHashMap.put("key3", "val3");
        redisTemplate.opsForHash().putAll("map", stringStringHashMap);
        Map<Object, Object> map = redisTemplate.opsForHash().entries("map");
        System.out.println("map.toString() = " + map.toString());
        Object o = redisTemplate.opsForHash().get("map", "key1");
        System.out.println("o = " + o);
        redisTemplate.opsForHash().entries("map");

        ArrayList<String> strings = new ArrayList<>();
        System.out.println("strings.size() = " + strings.size());
    }

}
