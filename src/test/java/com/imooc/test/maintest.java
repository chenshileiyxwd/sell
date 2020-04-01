package com.imooc.test;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName maintest
 * @Description
 * @Author mrleier
 * @Date 2019/9/1 15:28
 * @Version 1.0
 **/
public class maintest implements Runnable {
    static maintest instance1 = new maintest();
    static maintest instance2 = new maintest();
    static int i = 0;
    static int SUM = 10;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("i = " + i);
        System.out.println("SUM = " + SUM);

        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
        arrayList.add("ds");
        arrayList.add(1, "sds");

    }

    @Override
    public void run() {
        doAdd();
        addSome();
    }

    public static synchronized void doAdd() {
        for (int j = 0; j < 100000; j++) {
            i++;
        }
    }

    public static void addSome() {
        for (int k = 0; k < SUM; k++) {
            SUM++;
        }
    }
}
