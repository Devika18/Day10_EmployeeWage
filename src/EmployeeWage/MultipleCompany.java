package EmployeeWage;

import java.util.Random;
public class MultipleCompany {
    public static void EmpWage() {
        Random random = new Random();
        MultipleCompanyEmployeeWage empWage = new MultipleCompanyEmployeeWage();
        int currentDay = 1;
        int totalHrs = 0;
        int totalWage = 0;
        int currentDayHrs;
        int wage;
        empWage.getInput();
        while (empWage.checkCondition(currentDay, totalHrs)) {
            int present = random.nextInt(3);
            currentDayHrs = empWage.getEmployeeHrs(present);
            wage = empWage.getEmployeeWageOfDay(currentDayHrs);

            totalHrs = totalHrs + currentDayHrs;
            totalWage = totalWage + wage;
            currentDay = currentDay + 1;

        }
        System.out.println("Total Hours of Employee : " + totalHrs);
        System.out.println("Total Wage of Employee : " + totalWage);
    }
}

