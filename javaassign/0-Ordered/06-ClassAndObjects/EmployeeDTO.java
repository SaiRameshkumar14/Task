package sixClassAndObjects;

public class EmployeeDTO {

    private String employeeId;
    private String name;
    private String designation;
    private double salary;

    private String ssn;
    private String email;
    private String phoneNumber;

    private static String companyName = "Tech Solutions Inc.";

    public EmployeeDTO(String employeeId, String name, String designation, double salary, String ssn, String email, String phoneNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.ssn = ssn;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        EmployeeDTO.companyName = companyName;
    }

    public String getMaskedSSN() {
        return "****-****-" + ssn.substring(ssn.length() - 4);
    }

    public String getEmail() {
        return "Access Restricted";
    }

    public String getPhoneNumber() {
        return "Access Restricted";
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Company Name: " + companyName);
    }
}
