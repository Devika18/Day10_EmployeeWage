package EmployeeWage;

import java.util.Scanner;

public class EmployeeWageMain {

    //private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("****************************************************************");
        EmployeeWageSystem.EmployeeCheck();
        menu();
        MultipleCompany.EmpWage("Google", 20,100,20);
        MultipleCompany.EmpWage("Whirlpool", 10, 150, 15);
        MultipleCompany.EmpWage("TCS", 15, 125, 22);
        MultipleCompany.EmpWage("Accenture", 20,100,20);
        MultipleCompany.EmpWage("Capgemini", 10, 150, 15);
        MultipleCompany.EmpWage("Wipro", 15, 125, 22);

    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("****************************************************************");
            System.out.println("Which option do you want to select?");
            System.out.println("1. Full Time Employee salary");
            System.out.println("2. Part Time Employee salary");
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
