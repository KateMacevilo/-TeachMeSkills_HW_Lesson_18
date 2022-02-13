package com.teachMeSkills.lesson_18.task2;

/**
 * 2. Cоздать программу, иммитирующую утро: чтение нововостей, завтра, кофе.
 * Каждому потоку задать имя и приоритет из конфиг файла. Пусть имя и приоритет потока задается через файл пропертис.
 * Пусть будет 3 потока.
 * Создать и запустить 3 потока
 */
public class Main {

    public static void main(String[] args) {

        Prop property = new Prop();

        property.setProperties("1");
        MorningThread thread1 = new MorningThread(property.getName(), property.getPriority());
        System.out.println(thread1);

        property.setProperties("2");
        MorningThread thread2 = new MorningThread(property.getName(), property.getPriority());
        System.out.println(thread2);

        property.setProperties("3");
        MorningThread thread3 = new MorningThread(property.getName(), property.getPriority());
        System.out.println(thread3);

        thread2.start();
        thread3.start();
        thread1.start();

    }

}
