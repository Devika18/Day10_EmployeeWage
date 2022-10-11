package EmployeeWage;

import java.util.Scanner;

public class EmployeeWageMain {

    //private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWageSystem.EmployeeCheck();
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Which option do you want to select?");
            System.out.println("1. Employee salary of Full Time");
            System.out.println("2. Employee salary of Part Time");
            System.out.println("3. Exit");

            //Using switch case control statement
            int choice = sc.nextInt();
            EmployeeWageSystem emp = new EmployeeWageSystem();
            switch(choice) {
                case 1:
                    emp.fullTime();
                    break;
                case 2:
                    emp.partTime();
                    break;
                case 3:
                    emp.quit();
                    break;
                default :
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
