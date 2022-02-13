package com.teachMeSkills.lesson_18.task2;

public class MorningThread extends Thread {

    public MorningThread() {
    }

    public MorningThread(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    @Override
    public void run() {

        for (int i = 1; i < 4; i++) {
            System.out.println(getName() + " " + i);
//            try {
//               // Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

}
