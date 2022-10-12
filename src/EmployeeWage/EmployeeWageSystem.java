package EmployeeWage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWageSystem {
    public static void EmployeeCheck() {
        System.out.println("Checking Employee is present or not");
        Random random = new Random();
        int isPresent = random.nextInt(3);
        System.out.println("Random value is: "+isPresent);

        if(isPresent >= 1) {
            System.out.println("Employee is Present");
            DailyEmployeeWage();
        }
        else
            System.out.println("Employee is Absent");
    }
    public static void DailyEmployeeWage() {
        int wagePerHr = 20;
        int fullDayHr = 8;
        int empWage;
        System.out.println("Daily salary of the employee is: ");
        empWage = wagePerHr * fullDayHr;
        System.out.println(empWage);
    }

    public static void fullTime() {
        System.out.println("Employee Present for Full Time");
        int wagePerHr = 20;
        int fullDayHr = 8;
        int empWage;
        System.out.println("Daily salary of the employee is: ");
        empWage = wagePerHr * fullDayHr;
        System.out.println(empWage);
        EmpMonthWage();
    }

    public static void partTime() {
        System.out.println("Employee Present for Part Time");
        int wagePerHr = 20;
        int halfDayHr = 4;
        int empWage;
        System.out.println("Daily salary of the employee is: ");
        empWage = wagePerHr * halfDayHr;
        System.out.println(empWage);
        EmpMonthWage();
    }
    public static void multiCompany() {
        MultipleCompany.EmpWage();

    }
    public static void quit() {
        System.out.println("Exiting from Employee Wage System");
        System.exit(0);
    }
    public static void EmpMonthWage() {
        System.out.println("****************************************************************");
        System.out.println("Whether Employee present Full Time or Part Time?");
        Scanner sc = new Scanner(System.in);
        int empCheck = sc.nextInt();
        int isFullTime = 1;
        int isPartTime = 2;
        int day;
        int wagePerHr = 20;
        int fullDayHr = 8;
        int halfDayHr = 4;
        int salary, empWage = 0;

        switch(empCheck) {
            case 1:
                System.out.println("Employee is present for Full Time in Month");
                for(day=1;day<=20;day++) {
                    salary = wagePerHr * fullDayHr * day;
                    empWage = empCheck + salary;
                    System.out.println("Monthly salary of employee is: "+empWage);
                }
                WorkingHour();
                break;
            case 2:
                System.out.println("Employee is present for Part Time in Month");
                for(day=1;day<=20;day++) {
                    salary = wagePerHr * halfDayHr * day;
                    empWage = empCheck + salary;
                    System.out.println("Monthly salary of employee is: "+empWage);
                }
                WorkingHour();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public static void WorkingHour() {
        System.out.println("****************************************************************");
        System.out.println("Enter working hour of the employee");
        Scanner sc = new Scanner(System.in);
        int totalWorkingHr = sc.nextInt();
        int wagePerHr = 20, empWage = 0, day = 20;
        int salary;
        if(totalWorkingHr <= 100) {
            salary = wagePerHr * day * totalWorkingHr;
            empWage = empWage + salary;
            System.out.println("Salary of Employee as per total working hour is: "+empWage);
        }
        else
            System.out.println("Invalid Working Hour");
    }
}
