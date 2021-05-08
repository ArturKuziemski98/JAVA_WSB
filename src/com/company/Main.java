package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("cat");
        dog.name = "Rysiu";
        Phone phone1 = new Phone("Apple", "A43", "iOS", 16.11);

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

        Car car1 = new Car("R8","Audi");
        human1.vehicle = car1;
        System.out.println(human1.vehicle.producent);
        human1.setSalary(2000.00);
        human1.getSalary();

    }
}
