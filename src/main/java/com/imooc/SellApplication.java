package com.imooc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.imooc.dataobject.mapper")
@ServletComponentScan
public class SellApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellApplication.class, args);
    }

}
