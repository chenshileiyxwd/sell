package com.imooc.test;

/**
 * @ClassName Person
 * @Description TODO
 * @Author mrleier
 * @Date 2019/11/29 19:58
 * @Version 1.0
 **/
public class Person extends Family implements Animal {
   public int age;
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
