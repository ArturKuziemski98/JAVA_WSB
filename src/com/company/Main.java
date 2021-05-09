package com.company;
import devices.*;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("cat");
        dog.name = "Rysiu";
        Phone phone1 = new Phone("Apple", "A43", "20.01.2021","iOS", 16.11);

        Human human1 = new Human();
        System.out.println("Producer = " + phone1.producer);
        System.out.println("Name = " + dog.name);
        dog.feed();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();

        dog.feed();
        human1.mobilePhone = phone1;

        Car car1 = new Car("R8","Audi","10.20.2020","Blue","fast", 3000.00);
        Car car2 = new Car("R8","Audi","08.90.1998","Blue","fast", 3000.00);
        //human1.vehicle = car1;
        //System.out.println(human1.vehicle.producent);
        human1.setSalary(4000.00);
        human1.getSalary();
        human1.setVehicle(car1);
        human1.getVehicle();
        System.out.println(new Car("R8","Audi","02.02.2000","Blue","fast", 3000.00).equals(new Car("R8","Audi","02.02.2000","Blue","fast", 3000.00)));
        System.out.println(dog);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(phone1);
        System.out.println(human1);

    }
}
