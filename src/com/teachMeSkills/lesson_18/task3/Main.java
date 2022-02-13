package com.teachMeSkills.lesson_18.task3;

/**
 * 3. Есть СТО. На сто может быть в обслуживании максимум определенное количество машин.
 * Создать класс, который будет запускаться в отдельном потоке и будет добавлять машины на обсуживание в СТО.
 * Создать класс, который будет запускаться в отдельном потоке и будет забирать исправленные машины из СТО.
 * Пусть максимальное количество доступных для обсуживания машин задается через файл пропертис.
 * Использовать synchronized, wait, notify.
 */
public class Main {

    public static void main(String[] args) {

        AddCarThread addCarThread = new AddCarThread();
        addCarThread.start();

        TakeCarThread takeCarThread = new TakeCarThread();
        takeCarThread.start();
    }

}
