package com.imooc.synchronizedPackage;

/**
 * @ClassName SynchronizedMethordAndBlock
 * @Description TODO
 * @Author mrleier
 * @Date 2019/9/1 17:48
 * @Version 1.0
 **/
public class SynchronizedMethordAndBlock implements Runnable {
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        while (t1.isAlive() || t2.isAlive()) {

        }
    }
}
