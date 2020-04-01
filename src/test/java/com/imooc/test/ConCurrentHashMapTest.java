package com.imooc.test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ConCurrentHashMapTest
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/26 16:14
 * @Version 1.0
 **/
public class ConCurrentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> conmap = new ConcurrentHashMap<>();
        conmap.put("d", "as");
    }
}
