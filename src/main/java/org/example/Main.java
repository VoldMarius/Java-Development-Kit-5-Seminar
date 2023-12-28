package org.example;

public class Main {
    public static void main(String[] args) {
        Philosopher philosopher1 = new Philosopher("Аристотель");
        Philosopher philosopher2 = new Philosopher("Иммануил");
        Philosopher philosopher3 = new Philosopher("Платон");
        Philosopher philosopher4 = new Philosopher("Конфуций");
        Philosopher philosopher5 = new Philosopher("Сократ");
        try {
            philosopher1.join();
            philosopher2.join();
            philosopher3.join();
            philosopher4.join();
            philosopher5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Все философы поели и подумали");
    }

}