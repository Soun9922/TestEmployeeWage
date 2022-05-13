package employeewagecalculator;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("----Welcome to Employee Wage Competition----");
        double checkAttendance = Math.round(Math.random());
        switch (checkAttendance == 0) {
            case 0:
                System.out.println("The Employee is Absent.");
                break;
            default:
                System.out.println("The Employee is Present.");
        }
    }
}

