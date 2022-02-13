package com.teachMeSkills.lesson_18.task3;

import com.teachMeSkills.lesson_18.task3.util.Prop;

import java.util.List;

public class AddCarThread extends Thread {

    private Service service = Service.getService();
    private int properties = Prop.getProperties();

    @Override
    public void run() {

        while (true) {
            for (int i = 0; i < properties; i++) {
                if (service.getCarList().size() < properties) {
                    service.addCar(new Car(false));
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                    System.out.println("добавили Car" + i);
                }
            }


            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (service.getCarList().size() == properties) {
                int carNumb = (int) (Math.random() * (properties - 0));
                service.getCarList().get(carNumb).setReady(true);
                // notify();
            }
        }
    }


}
