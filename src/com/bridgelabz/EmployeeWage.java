package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage System");
        int employeeCheck = (int) (Math.random() * 10) % 2; //Using RANDOM function to get any random number for Employee presence.
        if (employeeCheck == 0) {
            System.out.println("Employee is absent.");
        }
        else {
            System.out.println("Employee is present.");
        }
    }
}
