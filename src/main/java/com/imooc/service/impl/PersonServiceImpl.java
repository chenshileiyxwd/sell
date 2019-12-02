package com.imooc.service.impl;

import com.imooc.dataobject.mapper.PersonMapper;
import com.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName PersonServiceImpl
 * @Description TODO
 * @Author mrleier
 * @Date 2019/11/25 20:04
 * @Version 1.0
 **/
@Service
public class PersonServiceImpl {
    @Autowired
    private PersonMapper mapper;

    public void insertOnePerson(Person person) {
        mapper.insert(person);
    }

}
