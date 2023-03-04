package com.bridgelabz;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 7;
    static final int IS_PART_TIME = 2;
    static final int IS_FULL_TIME = 1;
    static final int IS_ABSENT = 0;
    static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage System");
        int dailyWage = 0;
        int dayCount = 1;
        while (dayCount <= WORKING_DAYS_PER_MONTH) {
            int employeeCheck = (int) (Math.random() * 10) % 3; //Using RANDOM function to get any random number for Employee presence.
            switch (employeeCheck) { // using switch case to calculate Employee Wage
                case IS_PART_TIME:
                    System.out.println("Employee is Part Time");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Full Time");
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    dailyWage = WAGE_PER_HOUR * IS_ABSENT;
            }
            System.out.println("Daily wage of Day => " + dayCount + " is "  + dailyWage);
            dayCount++;
        }
    }
}
