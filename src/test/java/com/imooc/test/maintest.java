package com.imooc.test;

/**
 * @ClassName maintest
 * @Description
 * @Author mrleier
 * @Date 2019/9/1 15:28
 * @Version 1.0
 **/
public class maintest implements Runnable {
    static maintest instance1 = new maintest();
    static maintest instance2= new maintest();
    static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("i = " + i);
    }

    @Override
    public void run() {
        getpp();
    }
    public static synchronized void getpp() {
        for (int j = 0; j < 100000; j++) {
            i++;
        }
    }
}
