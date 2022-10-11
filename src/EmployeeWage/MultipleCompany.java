package EmployeeWage;
import java.util.Random;

public class MultipleCompany {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;

    public static int EmpWage(String company, int empRatePerHr,
                              int MaxHrsInMonth, int numWorkingDays) {

        int empHrs = 0, totalWorkingHrs = 0, empWage, totalEmpWage;
        int totalWorkingDays = 0;
        while (totalWorkingHrs <= MaxHrsInMonth && totalWorkingDays <= numWorkingDays) {
            totalWorkingDays++;
            Random random = new Random();
            int empCheck = random.nextInt(3);
            if (empCheck == isFullTime) {
                empHrs = 16;
            } else if (empCheck == isPartTime) {
                empHrs = 8;
            } else {
                empHrs = 0;
            }
            totalWorkingHrs = totalWorkingHrs + empHrs;
            System.out.println("Days:" + totalWorkingDays + "Emp Hrs:" + empHrs);
        }
        totalEmpWage = totalWorkingHrs * empRatePerHr;
        System.out.println("Total Employee Wage for month = " + totalEmpWage);
        return isFullTime;
    }
}
