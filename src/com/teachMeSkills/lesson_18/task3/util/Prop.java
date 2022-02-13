package com.teachMeSkills.lesson_18.task3.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {

    public static int getProperties() {
        Properties appProps = new Properties();

        try (FileInputStream fis = new FileInputStream("D:\\все_файлы\\java\\projects\\Homework_18\\src\\com\\teachMeSkills\\lesson_18\\task3\\resource\\app.properties")) {
            appProps.load(fis);
        } catch (IOException e) {
            System.out.println("Не удалось открыть файл " + e.getMessage());
        }

        int max = Integer.parseInt(appProps.getProperty("maxCars"));
        return max;

    }



}
