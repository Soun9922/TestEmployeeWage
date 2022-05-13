package employeewagecalculator;

import java.util.Random;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int WORKING_DAY_PER_MONTH = 20;
    public static void main(String[] args) {
        System.out.println("----Welcome to Employee Wage Competition----");
        double checkAttendance = Math.round(Math.random());
        switch (checkAttendance == 0) {
            case 0:
                System.out.println("The Employee is Absent.");
                break;
            default:
                int totalMonthlySalary = WAGE_PER_HOUR * FULL_DAY_HOUR * WORKING_DAY_PER_MONTH;
                System.out.println("The Employee is Present, The monthly salary of the Employee : " + totalMonthlySalary);
        }
    }
}

