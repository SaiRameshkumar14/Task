package sixClassAndObjects;

public class EmployeeMain {

    public static void main(String[] args) {
        EmployeeDTO employee = new EmployeeDTO("E123", "John Doe", "Software Engineer", 75000, "123-45-6789", "johndoe@example.com", "9876543210");

        employee.displayEmployeeDetails();

        System.out.println("Masked SSN: " + employee.getMaskedSSN());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone Number: " + employee.getPhoneNumber());
    }
}
