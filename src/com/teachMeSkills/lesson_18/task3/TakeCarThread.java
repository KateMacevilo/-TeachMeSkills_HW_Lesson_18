package com.teachMeSkills.lesson_18.task3;

public class TakeCarThread extends Thread {

      private Service service = Service.getService();

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < service.getCarList().size(); i++) {
                if (service.getCarList().get(i) != null && service.getCarList().get(i).isReady()) {
                    service.removeCar(i);
                    System.out.println("удалена Car" + i);
                }
            }
        }
    }

}
