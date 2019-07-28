package com.imooc.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName LoggerTest
 * @Description TODO
 * @Author mrleier
 * @Date 2019/5/14 22:43
 * @Version 1.0
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    @Test
    public void test1() {
        String name = "csl";
        String password = "123456";
        log.debug("debuger====------......");
        log.info("name:{},password:{}",name,password);
        log.error("error====------......");
    }
}
