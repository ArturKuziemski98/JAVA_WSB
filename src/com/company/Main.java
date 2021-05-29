package com.company;
import creatures.*;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Pet pet1 = new Pet("Cat");
        Pet dog = new Pet("Cat");
        pet1.name = "Kiziul";
        dog.name = "Rysiu";
        Phone phone1 = new Phone("Apple", "A43", "20.01.2021","iOS", 16.11);
        Phone phone2 = new Phone("Huwawei","Bill","20.05.2018","Android",16.11);
        Human human1 = new Human();
        Human human2 = new Human();
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
       phone1.turnOn();
       car1.turnOn();
       human1.cash = 10000.00;
       human2.pet = pet1;
       human2.cash = 100.00;
       pet1.sell(human1,human2,200.00);
       System.out.println(human1.cash+"Cash2: "+human2.cash+"Pet1:"+human1.pet+"Pet2:"+human2.pet);
       //sprawdzam tylko dla zwierzat inne rzeczy beda dzialac patrzac na to ze zmieniam tylko 1 rzecz w tych metodach
        phone1.sell(human1,human2,100.00);
        System.out.println(human2.mobilePhone);
    }
}
