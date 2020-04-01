package com.imooc.test;

/**
 * @ClassName test11
 * @Description TODO
 * @Author mrleier
 * @Date 2019/12/28 11:15
 * @Version 1.0
 **/
public class test11 {
    public static void main(String[] args) {
        String a = "abc" + "d";
        String b = "a" + "bcd";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
