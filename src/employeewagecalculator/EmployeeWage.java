package employeewagecalculator;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Competition");
        int attendanceCheck = (int)Math.floor(Math.random() * 10) % 2;
        if (attendanceCheck == 0)
            System.out.println("Employee is absent.");
        else
            System.out.println("Employee is Present.");
    }
}
