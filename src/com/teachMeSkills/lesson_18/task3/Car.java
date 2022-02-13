package com.teachMeSkills.lesson_18.task3;


public class Car {

    private boolean isReady;

    public Car(boolean isReady) {
        this.isReady = isReady;
    }

    public Car() {
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }
}
