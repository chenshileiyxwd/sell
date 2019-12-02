package com.imooc.controller;

import com.imooc.service.impl.PersonServiceImpl;
import com.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PersonController
 * @Description TODO
 * @Author mrleier
 * @Date 2019/11/25 20:24
 * @Version 1.0
 **/
@RestController
@SpringBootApplication
public class PersonController {
    @Autowired
    private PersonServiceImpl service;

    @RequestMapping("person/add")
    public void addOnePerson(Person person) {
        service.insertOnePerson(person);
    }

}
