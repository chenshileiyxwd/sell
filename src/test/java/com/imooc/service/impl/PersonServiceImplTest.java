package com.imooc.service.impl;

import com.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PersonServiceImplTest {
    @Autowired
    PersonServiceImpl service;

    @Test
    public void insertOnePerson() {
        Person person = new Person();
        person.setMobile("123455666");
        person.setName("csl test for 1126");
        service.insertOnePerson(person);
    }
}