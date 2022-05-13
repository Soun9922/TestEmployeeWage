package employeewagecalculator;

import java.util.Random;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("----Welcome to Employee Wage Competition----");
        Random random = new Random();
        int empAttendance = random.nextInt(2) + 1;
        if (empAttendance == 1) {
            int full_time_Salary = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("The Employee Salary : " + full_time_Salary);
        } else if (empAttendance == 2) {
            int Part_time_Salary = (WAGE_PER_HOUR * PART_TIME_HOUR);
            System.out.println("The PartTime Employee Salary : " + Part_time_Salary);
        } else
            System.out.println("The Employee is absent.");
    }
}


