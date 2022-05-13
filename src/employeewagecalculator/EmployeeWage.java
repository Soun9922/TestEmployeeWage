package employeewagecalculator;

import java.util.Random;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;

    public static void main(String[] args) {
        int IsAbsent = 1;
        System.out.println("Welcome to Employee Wage Competition");
        int attendanceCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (attendanceCheck == IsAbsent)
            System.out.println("Employee is absent.");
        else {
            int employeeWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
            System.out.println("Employee is Present, The Wage is : " + employeeWage);
        }
    }
}
