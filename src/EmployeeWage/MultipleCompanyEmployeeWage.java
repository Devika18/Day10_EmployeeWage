package EmployeeWage;

import java.util.Scanner;

public class MultipleCompanyEmployeeWage {
    Scanner scan = new Scanner(System.in);
    public String company;
    public int fullDayHr;
    public int halfDayHr;
    public int wagePerHr;
    public int totalWorkingDays;
    public int totalWorkingHrs;

    MultipleCompanyEmployeeWage() {
        company = "Whirlpool";
        fullDayHr = 10 ;
        halfDayHr = 6 ;
        wagePerHr = 20 ;
        totalWorkingDays = 20;
        totalWorkingHrs = 100 ;
    }


    public void getInput() {
        System.out.println("Enter Company Name: ");
        this.company = scan.next();
        System.out.println("Enter Full Time Employee hours per Day: ");
        this.fullDayHr = scan.nextInt();
        System.out.println("Enter Part Time Employee hours per Day: ");
        this.halfDayHr = scan.nextInt();
        System.out.println("Enter Wage per hours: ");
        this.wagePerHr = scan.nextInt();
        System.out.println("Enter total working days per month: ");
        this.totalWorkingDays = scan.nextInt();
        System.out.println("Enter maximum working hours per month: ");
        this.totalWorkingHrs = scan.nextInt();

    }


    public int getEmployeeHrs(int present) {
        switch (present) {
            case 2:
                return fullDayHr ;
            case 1:
                return halfDayHr ;
            default :
                return 0 ;
        }
    }
    public int getEmployeeWageOfDay(int hours) {
        return  wagePerHr * hours ;
    }
    public boolean checkCondition(int currentDay, int totalHrs) {
        if (currentDay!=this.totalWorkingDays && totalHrs <= totalWorkingHrs){
            return true;
        }
        else {
            return false;
        }

    }
}
