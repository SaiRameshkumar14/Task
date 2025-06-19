package university.courses;

public class Course {

    public String courseName;
    public int credits;

    public Course(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
    }

    public void display() {
        System.out.println("Course: " + courseName + " | Credits: " + credits);
    }
}
