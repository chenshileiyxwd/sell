package com.imooc.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName TestMain
 * @Description TODO
 * @Author mrleier
 * @Date 2019/11/29 19:58
 * @Version 1.0
 **/
public class TestMain {
    public static void main(String[] args) {
        //通过一个class对象操作Person.class类
        try {
            Class person = Class.forName("com.imooc.test.Person");
            Constructor constructor = person.getConstructor(String.class);
            Person p2 = (Person) constructor.newInstance("陈世磊");
            System.out.println("p2 = " + p2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
