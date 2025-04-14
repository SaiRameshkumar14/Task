package javaassign.tenAbstract;

import java.util.Scanner;

abstract class Employee {

    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculatePay();

    void getEmployeeDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class HourlyEmployee extends Employee {

    double hoursWorked;
    double ratePerHour;

    HourlyEmployee(String name, int id, double hoursWorked, double ratePerHour) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    double calculatePay() {
        return hoursWorked * ratePerHour;
    }
}

class SalariedEmployee extends Employee {

    double monthlySalary;

    SalariedEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculatePay() {
        return monthlySalary;
    }
}

public class EmployeeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee type (hourly/salaried): ");
        String type = sc.nextLine();

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter ID: ");
        int id = sc.nextInt();

        Employee emp;

        if (type.equalsIgnoreCase("hourly")) {
            System.out.println("Enter hours worked: ");
            double hours = sc.nextDouble();
            System.out.println("Enter rate per hour: ");
            double rate = sc.nextDouble();
            emp = new HourlyEmployee(name, id, hours, rate);
        } else {
            System.out.println("Enter monthly salary: ");
            double salary = sc.nextDouble();
            emp = new SalariedEmployee(name, id, salary);
        }

        emp.getEmployeeDetails();
        System.out.println("Calculated Pay: ₹" + emp.calculatePay());
    }
}
