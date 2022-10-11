package EmployeeWage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeWageSystem {

    public static List<Company> dataBase = new ArrayList<>();

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
    }

    public static void partTime() {
        System.out.println("Employee Present for Part Time");
        int wagePerHr = 20;
        int halfDayHr = 4;
        int empWage;
        System.out.println("Daily salary of the employee is: ");
        empWage = wagePerHr * halfDayHr;
        System.out.println(empWage);
    }

    public static void quit() {
        System.out.println("Exiting from Employee Wage System");
        System.exit(0);
    }
}
