package com.company;
import creatures.Animal;
import java.util.*;
import devices.*;
import creatures.*;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    String gender;
    public Animal pet;
    public Phone mobilePhone;
    private Object[] garage;
    private Double salary;
    public Double cash;
    public int carsc;

    public Human(String firstName,String lastName,Integer age,String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.garage = garage;
        carsc = 0;
        garage = new Object[10];
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
    public void garageValue(){
        int c = 0;
        int sum = 0;
        for (c=0;c<garage.length;c++){
            sum = sum + 1;
        }
        System.out.println(sum);
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
