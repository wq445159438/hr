package com.test;

import java.util.concurrent.locks.ReentrantLock;

public class Test3 {

    static ReentrantLock lock1 = new ReentrantLock();
    static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                op1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                op2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void op1() throws InterruptedException {
        lock1.lock();
        Thread.sleep(500);
        lock2.lock();
        System.out.println("线程1开始");

        Thread.sleep(500);
        lock2.unlock();
        lock1.unlock();
        System.out.println("线程1结束");
    }

    public static void op2() throws InterruptedException {
        lock2.lock();
        Thread.sleep(500);
        lock1.lock();
        System.out.println("线程2开始");

        Thread.sleep(500);
        lock1.unlock();
        lock2.unlock();
        System.out.println("线程2结束");
    }
}
