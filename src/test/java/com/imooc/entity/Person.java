package com.imooc.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Person
 * @Description TODO
 * @Author mrleier
 * @Date 2020/4/1 19:55
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Person {
    String name;
    String address;
    int age;
    boolean flag;

    public Person(String name, String address, int age, boolean flag) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.flag = flag;
    }
}
