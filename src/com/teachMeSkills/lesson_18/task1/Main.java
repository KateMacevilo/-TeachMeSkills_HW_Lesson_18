package com.teachMeSkills.lesson_18.task1;

/**
 * 1. Создать три потока Т1, Т2 и Т3
 * Реализовать выполнение поток в последовательности Т3 -> Т2 -> Т1
 * (используя метод join)
 */
public class Main {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread("T1");
        MyThread thread2 = new MyThread("T2");
        MyThread thread3 = new MyThread("T3");

        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
