package com.company;
import devices.*;

import devices.Car;
import devices.Phone;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    String gender;
    Animal pet;
    Phone mobilePhone;
    private Car vehicle;
    private Double salary;


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
    public void setVehicle(Car newCar){
        if (this.salary > newCar.value) {
            System.out.println("You bought the car with cash!");
            this.vehicle = newCar;
        }
        else if (newCar.value/12 < this.salary){
             System.out.println("You bought the car with credit!");
             this.vehicle = newCar ;
        }
         else{
             System.out.println("Find a new job or get a raise! You cant afford the car.");
        }
    }
    public Car getVehicle(){
        return this.vehicle;
    }
    public String toString(){
        return "First name: "+firstName+", Last name: "+lastName+", Age: "+age+", Gender: "+gender+", Pet: "+pet+", Mobile phone: "+mobilePhone+", Vehicle: "+vehicle+", Salary: "+salary;
    }
}
