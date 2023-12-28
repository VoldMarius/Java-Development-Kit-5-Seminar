package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.currentThread;

public class Dinner {
    private static Lock lock = new ReentrantLock();

    public static void dinner() {
        lock.lock();
        try {
            for (int i = 0; i < 3; i++) {
                eat();
                Thread.sleep(600);
                thing();
            }
            System.out.println(currentThread().getName() + " - Поел 3 раза \n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }

    }

    private static void eat() {
        System.out.println(currentThread().getName() + " - ест");
    }

    private static void thing() {
        System.out.println(currentThread().getName() + " - думает");
    }
}