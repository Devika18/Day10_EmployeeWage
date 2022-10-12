package EmployeeWage;

import java.util.Scanner;
import java.util.Random;
public class MultipleCompany {
    public static void EmpWage() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        MultipleCompanyEmployeeWage empWage = new MultipleCompanyEmployeeWage();

        int currentDay = 1;
        int totalHrs = 0;
        int totalWage = 0;
        int hoursOfCurrentDay;
        int wage;

        empWage.getInput();
        while(empWage.checkCondition(currentDay,totalHrs)){
            int present = random.nextInt(3);
            hoursOfCurrentDay = empWage.getEmployeeHrs(present);
            wage = empWage.getEmployeeWageOfDay(hoursOfCurrentDay);
            totalHrs = totalHrs + hoursOfCurrentDay;
            totalWage =  totalWage + wage;
            currentDay = currentDay + 1;
        }
        System.out.println("Total Hours of Employee : " + totalHrs);
        System.out.println("Total Wage of Employee : " + totalWage);


        /*System.out.println("Enter Working Hours: ");
        totalWorkingHrs = sc1.nextInt();
        System.out.println("Enter Working Days: ");
        totalWorkingDays = sc1.nextInt();

        System.out.println("Give the input for Company choice");
        Scanner sc = new Scanner(System.in);
        //int choice = sc.nextInt();*/

        /*switch (choice) {
            case 1:
                if (totalWorkingHrs <= MaxHrsInMonth && totalWorkingDays <= numWorkingDays) {
                    Google();
                } else
                    EmployeeWageMain.menu();
                break;
            case 2:
                if (totalWorkingHrs <= MaxHrsInMonth && totalWorkingDays <= numWorkingDays) {
                    Whirlpool();
                } else
                    EmployeeWageMain.menu();
                break;
            case 3:
                if (totalWorkingHrs <= MaxHrsInMonth && totalWorkingDays <= numWorkingDays) {
                    TCS();
                } else
                    EmployeeWageMain.menu();
                break;
            case 4:
                if (totalWorkingHrs <= MaxHrsInMonth && totalWorkingDays <= numWorkingDays) {
                    Wipro();
                } else
                    EmployeeWageMain.menu();
                break;
            case 5:
                if (totalWorkingHrs <= MaxHrsInMonth && totalWorkingDays <= numWorkingDays) {
                    Infosys();
                } else
                    EmployeeWageMain.menu();
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }*/

    /*public static void Google() {
        int fullDayHr = 10;
        int empWage;
        System.out.println("Calculating Google Employee salary for Full Time");
        empWage = totalWorkingDays * totalWorkingHrs * fullDayHr;
        System.out.println(empWage);

        System.out.println("Calculating Google Employee salary for Part Time");
        int halfDayHr = 6;
        int empWage1;
        empWage1 = totalWorkingDays * totalWorkingHrs * halfDayHr;
        System.out.println(empWage1);
    }

    public static void Whirlpool() {
        System.out.println("Calculating Whirlpool Employee salary for Full Time");
        int fullDayHr = 10;
        int empWage;
        empWage = totalWorkingDays * totalWorkingHrs * fullDayHr;
        System.out.println(empWage);

        System.out.println("Calculating Whirlpool Employee salary for Part Time");
        int halfDayHr = 6;
        int empWage1;
        empWage1 = totalWorkingDays * totalWorkingHrs * halfDayHr;
        System.out.println(empWage1);
    }
    public static void TCS() {
        System.out.println("Calculating TCS Employee salary for Full Time");
        int fullDayHr = 10;
        int empWage;
        empWage = totalWorkingDays * totalWorkingHrs * fullDayHr;
        System.out.println(empWage);

        System.out.println("Calculating TCS Employee salary for Part Time");
        int halfDayHr = 6;
        int empWage1;
        empWage1 = totalWorkingDays * totalWorkingHrs * halfDayHr;
        System.out.println(empWage1);
    }
    public static void Wipro() {
        System.out.println("Calculating Wipro Employee salary for Full Time");
        int fullDayHr = 10;
        int empWage;
        empWage = totalWorkingDays * totalWorkingHrs * fullDayHr;
        System.out.println(empWage);

        System.out.println("Calculating Wipro Employee salary for Part Time");
        int halfDayHr = 6;
        int empWage1;
        empWage1 = totalWorkingDays * totalWorkingHrs * halfDayHr;
        System.out.println(empWage1);
    }
    public static void Infosys() {
        System.out.println("Calculating Infosys Employee salary for Full Time");
        int fullDayHr = 10;
        int empWage;
        empWage = totalWorkingDays * totalWorkingHrs * fullDayHr;
        System.out.println(empWage);

        System.out.println("Calculating Infosys Employee salary for Part Time");
        int halfDayHr = 6;
        int empWage1;
        empWage1 = totalWorkingDays * totalWorkingHrs * halfDayHr;
        System.out.println(empWage1);
    }*/
    }
}

