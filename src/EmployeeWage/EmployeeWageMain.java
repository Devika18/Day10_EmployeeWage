package EmployeeWage;

import java.util.Scanner;

public class EmployeeWageMain {

    //private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("****************************************************************");
        ManageEmployeeWage empWageComputation = new ManageEmployeeWage(3);
        empWageComputation.addCompany("Microsoft", 4, 20, 100);
        empWageComputation.addCompany("Google", 5, 35, 120);
        empWageComputation.addCompany("Apple", 9, 15, 50);
        empWageComputation.calculateTotalWage();
        System.out.println("****************************************************************");
        ManageWageArrayList empWageList = new ManageWageArrayList();
        empWageList.addCompanyDetails("Microsoft", 4, 20, 100);
        empWageList.addCompanyDetails("Google", 5, 35, 120);
        empWageList.addCompanyDetails("Apple", 9, 15, 50);
        empWageList.calculateTotalEmpWage();

        EmployeeWageSystem.EmployeeCheck();
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("****************************************************************");
            System.out.println("Which option do you want to select?");
            System.out.println("1. Full Time Employee salary");
            System.out.println("2. Part Time Employee salary");
            System.out.println("3. Check for Multiple Company");
            System.out.println("4. Exit");

            //Using switch case control statement
            int choice = sc.nextInt();
            EmployeeWageSystem emp = new EmployeeWageSystem();
            MultipleCompany multi = new MultipleCompany();
            switch(choice) {
                case 1:
                    emp.fullTime();
                    break;
                case 2:
                    emp.partTime();
                    break;
                case 3:
                    emp.multiCompany();
                    break;
                case 4:
                    emp.quit();
                    break;
                default :
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
