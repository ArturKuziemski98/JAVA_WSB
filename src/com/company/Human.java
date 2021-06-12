package com.company;
import creatures.Animal;
import java.util.*;
import devices.*;
import creatures.*;

public class Human implements Comparable<Human>{
    String firstName;
    String lastName;
    Integer age;
    String gender;
    public Animal pet;
    public Phone mobilePhone;
    public Car[] garage;
    private Double salary;
    public Double cash;
    public int carsc;

    public Human(String firstName,String lastName,Integer age,String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        carsc = 0;
    }
    public Human(String firstName,String lastName,Integer age,String gender,Integer x){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        garage = new Car[x];
        carsc = 0;
    }
    public  Double getSalary(){
    System.out.println("Todays date: 08.05.2021");
    System.out.print("Salary: "+this.salary);
    return this.salary;
    }
    public void setSalary(double salaryNew){
        if (salaryNew < 0)
        {
            System.out.println();
            System.out.println("Salary cant be negative.");
        }
        else{
            System.out.println();
            System.out.println("New salary has been send to the accounting system!");
            System.out.println("Please, collect annex to the contract from Hania from the staff!");
            System.out.println("ZUS and US have been informed about the salary change, there is no need to hide it :D ");
        this.salary = salaryNew;
        }
    }
    public void sell(){
        System.out.println("You cant sell humans!");
    }
    public void garageValue(){
        double x =0;
        for(int i =0;i<garage.length;i++) {
            if (this.garage[i] !=null) {
                x += this.garage[i].value;
            }
            else {
                break;
            }
        }
        System.out.println("Garage value: "+x);
    }
    @Override
    public int compareTo(Human o){
        return toString().compareTo(o.toString());
    }
    public void garageSort(){

    }
    public void setCar(int place, Car newCar){
        if (this.salary > newCar.value) {
            System.out.println("You bought the car with cash!");
            this.garage[place] = newCar;
        }
        else if (newCar.value/12 < this.salary){
             System.out.println("You bought the car with credit!");
             this.garage[place] = newCar ;
        }
         else{
             System.out.println("Find a new job or get a raise! You cant afford the car.");
        }
    }
    public void getCar(int place){
        System.out.println(garage[place]);
    }
    public String toString(){
        return "First name: "+firstName+", Last name: "+lastName+", Age: "+age+", Gender: "+gender+", Pet: "+pet+", Mobile phone: "+mobilePhone+", Vehicle: "+garage+", Salary: "+salary;
    }
}
