
class Employee {

    public void getEmployeeDetails() {
        System.out.println("Employee details: Default");
    }
}

class HourlyEmployee extends Employee {

    @Override
    public void getEmployeeDetails() {
        System.out.println("Hourly Employee details: Paid by hour");
    }
}

class SalariedEmployee extends Employee {

    @Override
    public void getEmployeeDetails() {
        System.out.println("Salaried Employee details: Fixed monthly salary");
    }
}

public class EmployeeMain {

    public static void main(String[] args) {
        Employee e1 = new HourlyEmployee();
        Employee e2 = new SalariedEmployee();

        e1.getEmployeeDetails();
        e2.getEmployeeDetails();
    }
}
