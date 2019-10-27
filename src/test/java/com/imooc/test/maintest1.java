package com.imooc.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/**
 * @ClassName maintest1
 * @Description
 * @Author mrleier
 * @Date 2019/10/24 23:08
 * @Version 1.0
 **/
public class maintest1 {
    public static void main(String[] args) throws Exception {
        long l = System.currentTimeMillis();
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> sets = new HashSet<>();
        for (int i = 0; i < 900 * 100 * 100 * 2; i++) {
            list.add(i + "");
            sets.add(i + "");
        }
        if (list.size() != sets.size()) {
            throw new Exception("buahoyisi");
        }
        long l1 = System.currentTimeMillis();
        System.out.println("finish-------------");
        System.out.println("use " + (l1 - l) + "ms");
        System.out.println("sets.size() = " + sets.size());
        CountDownLatch countDownLatch = new CountDownLatch(3);
        countDownLatch.countDown();

    }
}
