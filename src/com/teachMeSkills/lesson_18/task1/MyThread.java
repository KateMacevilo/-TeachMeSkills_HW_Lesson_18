package com.teachMeSkills.lesson_18.task1;

public class MyThread extends Thread {

    String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {
            System.out.println("name Thread " + name + " " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
