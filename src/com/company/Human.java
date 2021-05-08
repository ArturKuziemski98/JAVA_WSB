package com.company;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    String gender;
    Animal pet;
    Phone mobilePhone;
    Car vehicle;
    private double salary;


    public  double getSalary(){
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
}
