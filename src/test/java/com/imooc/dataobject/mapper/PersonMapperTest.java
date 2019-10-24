package com.imooc.dataobject.mapper;

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
public class PersonMapperTest {
    @Autowired
    private PersonMapper mapper;
    @Test
    public void insertSeller() {
        Person person = new Person();
        person.setName("csl");
        person.setMobile("12345");
        mapper.insert(person);
    }

}