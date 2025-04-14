package university.faculty;

public class Faculty {

    public String facultyName;
    public String department;

    public Faculty(String facultyName, String department) {
        this.facultyName = facultyName;
        this.department = department;
    }

    public void display() {
        System.out.println("Faculty: " + facultyName + " | Department: " + department);
    }
}
