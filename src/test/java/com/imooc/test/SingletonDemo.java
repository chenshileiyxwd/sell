package com.imooc.test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName TestMain
 * @Description 并发情况下单例模式会出问题，构造函数被多次调用
 * @Author mrleier
 * @Date 2019/11/29 19:58
 * @Version 1.0
 **/
public class SingletonDemo{
    private static volatile SingletonDemo instance = null;

    public SingletonDemo() {
        System.out.println(Thread.currentThread().getName() + "\t 我的SingletonDemo的构造方法");
    }

    //double check lock 双端检索机制
    public static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        atomicInteger.compareAndSet(5, 11);
        int i = atomicInteger.get();
        System.out.println(i);

        ConcurrentHashMap<String, Integer> conmap = new ConcurrentHashMap<>();
        conmap.put("12", 3);

        ReentrantLock reentrantLock = new ReentrantLock();

    }
}