package com.teachMeSkills.lesson_18.task3;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private List<Car> carList = new ArrayList<>();
    private static Service service;

    private Service() {
    }

    public static Service getService(){
        if (service == null){
            service = new Service();
        }
        return service;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public synchronized void addCar(Car car){
        carList.add(car);
    }

    public synchronized void removeCar(int i){
        carList.remove(i);
    }

}
