package EmployeeWage;
import java.util.Scanner;

public class MultipleCompany {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;

    public static Scanner sc1 = new Scanner(System.in);
    public static int totalWorkingDays;
    public static int totalWorkingHrs;

    public static void EmpWage() {
        int MaxHrsInMonth = 100, numWorkingDays = 20;

        System.out.println("Enter Working Hours: ");
        totalWorkingHrs = sc1.nextInt();
        System.out.println("Enter Working Days: ");
        totalWorkingDays = sc1.nextInt();

        System.out.println("Give the input for Company choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
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
    }

    public static void Google() {
        System.out.println("Calculating Google Employee salary for Full Time");
        int fullDayHr = 16;
        int empWage;
        empWage = totalWorkingDays * totalWorkingHrs * fullDayHr;
        System.out.println(empWage);

        System.out.println("Calculating Google Employee salary for Part Time");
        int halfDayHr = 8;
        int empWage1;
        empWage1 = totalWorkingDays * totalWorkingHrs * halfDayHr;
        System.out.println(empWage1);
    }

    public static void Whirlpool() {
        System.out.println("Calculating Whirlpool Employee salary for Full Time");
        int fullDayHr = 16;
        int empWage;
        empWage = totalWorkingDays * totalWorkingHrs * fullDayHr;
        System.out.println(empWage);

        System.out.println("Calculating Whirlpool Employee salary for Part Time");
        int halfDayHr = 8;
        int empWage1;
        empWage1 = totalWorkingDays * totalWorkingHrs * halfDayHr;
        System.out.println(empWage1);
    }
    public static void TCS() {
        System.out.println("Calculating TCS Employee salary for Full Time");
        int fullDayHr = 16;
        int empWage;
        empWage = totalWorkingDays * totalWorkingHrs * fullDayHr;
        System.out.println(empWage);

        System.out.println("Calculating TCS Employee salary for Part Time");
        int halfDayHr = 8;
        int empWage1;
        empWage1 = totalWorkingDays * totalWorkingHrs * halfDayHr;
        System.out.println(empWage1);
    }
    public static void Wipro() {
        System.out.println("Calculating Wipro Employee salary for Full Time");
        int fullDayHr = 16;
        int empWage;
        empWage = totalWorkingDays * totalWorkingHrs * fullDayHr;
        System.out.println(empWage);

        System.out.println("Calculating Wipro Employee salary for Part Time");
        int halfDayHr = 8;
        int empWage1;
        empWage1 = totalWorkingDays * totalWorkingHrs * halfDayHr;
        System.out.println(empWage1);
    }
    public static void Infosys() {
        System.out.println("Calculating Infosys Employee salary for Full Time");
        int fullDayHr = 16;
        int empWage;
        empWage = totalWorkingDays * totalWorkingHrs * fullDayHr;
        System.out.println(empWage);

        System.out.println("Calculating Infosys Employee salary for Part Time");
        int halfDayHr = 8;
        int empWage1;
        empWage1 = totalWorkingDays * totalWorkingHrs * halfDayHr;
        System.out.println(empWage1);
    }
}

