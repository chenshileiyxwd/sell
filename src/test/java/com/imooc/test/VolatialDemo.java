package com.imooc.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName VolatialDemo
 * @Description AtomicInteger 保证原则性
 * @Author mrleier
 * @Date 2019/12/26 18:52
 * @Version 1.0
 **/
public class VolatialDemo {
    public static void main(String[] args) {
        MyData myData = new MyData();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    myData.addPP();
                }
            }, String.valueOf(i)).start();
        }

        //等待上面的20个线程都计算完成后，在用main线程查询最终结果
        /*try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //更好的办法判断上面的10个线程是否执行完毕
        //默认后台有两个线程，一个是main线程，另一个GC线程，所以此处判断需要大于2
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + "\t data is " + myData.number);
    }
}

class MyData {
    AtomicInteger number = new AtomicInteger();
    int anInt = 1;
    public void addPP() {
        number.getAndIncrement();
        anInt++;
    }
}
