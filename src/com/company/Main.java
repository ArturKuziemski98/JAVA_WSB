package com.company;
import creatures.*;
import java.util.ArrayList;
import java.util.Collections;
import devices.*;

import javax.xml.stream.FactoryConfigurationError;


public class Main {

    public static void main(String[] args) {
        Pet pet1 = new Pet("Cat");
        Pet dog = new Pet("Cat");
        FarmAnimal cow = new FarmAnimal("Cow");
        pet1.name = "Kiziul";
        dog.name = "Rysiu";
        Phone phone1 = new Phone("Apple", "A43", "20.01.2021","iOS", 16.11);
        Phone phone2 = new Phone("Huwawei","Bill","20.05.2018","Android",16.11);
        Human human1 = new Human("Artur","Kuziemski",23,"Male",10);
        Human human2 = new Human("Adam","Małysz",50,"Male",10);
        System.out.println("Producer = " + phone1.producer);
        System.out.println("Name = " + dog.name);
        dog.feed();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();

        dog.feed();
        human1.mobilePhone = phone1;

        Electric electric1 = new Electric("R8","Audi","10.20.2020","Blue","fast", 3000.00);
        Disel disel1 = new Disel("R8","Audi","08.90.1998","Blue","fast", 3000.00);
        //human1.vehicle = car1;
        //System.out.println(human1.vehicle.producent);
        human1.setSalary(4000.00);
        human1.getSalary();
        System.out.println(new LPG("R8","Audi","02.02.2000","Blue","fast", 3000.00).equals(new LPG("R8","Audi","02.02.2000","Blue","fast", 3000.00)));
        System.out.println(dog);
        System.out.println(electric1);
        System.out.println(disel1);
        System.out.println(phone1);
        System.out.println(human1);
       phone1.turnOn();
       electric1.turnOn();
       human1.cash = 10000.00;
       human2.pet = pet1;
       human2.cash = 100.00;
       pet1.sell(human1,human2,200.00);
       System.out.println(human1.cash+"Cash2: "+human2.cash+"Pet1:"+human1.pet+"Pet2:"+human2.pet);
       //sprawdzam tylko dla zwierzat inne rzeczy beda dzialac patrzac na to ze zmieniam tylko 1 rzecz w tych metodach
        phone1.sell(human1,human2,100.00);
        System.out.println(human2.mobilePhone);
        human1.setCar(0,electric1);
        //przy dodaniu samochodu do czlowieka nie jest dodawany do list właścicieli
        //dlatego metoda transaction dziala dopiero po 2 sprzedaniu
        human1.setCar(1,disel1);
        human1.getCar(0);
        human1.getCar(1);
        electric1.sell(human1,human2,200.00);
        electric1.sell(human2,human1,200.00);
        electric1.sell(human1,human2,200.00);
        electric1.sell(human2,human1,200.00);
        disel1.sell(human1,human2,200.00);
        cow.beEaten();
        electric1.transactionsCount();
        disel1.anyOwners();
        human1.garageValue();
        human1.garageSort();
        Application app1 = new Application("Run","1.2",400.00);
        Application app2 = new Application("Jump","1.289",0.00);
        Application app3 = new Application("Ahtung!","6.9",0.00);
        phone1.installNewApp(human1,app1);
        phone1.installNewApp(human1,app2);
        phone1.installNewApp(human1,app3);
        phone1.appCheck(app1);
        phone1.appCheck("Jump");
        electric1.transaction(human2,human1);
        phone1.appCheck("XD");
        phone1.appFree();
        phone1.appAll();
        phone1.appsAZ();
        phone1.apps0();
    }
}
