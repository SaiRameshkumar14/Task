package university;

import university.courses.Course;
import university.faculty.Faculty;
import university.students.Student;

public class UniversityMain {

    public static void main(String[] args) {
        Student s = new Student("Sai Ddiwaker", 2001);
        Course c = new Course("Java Programming", 4);
        Faculty f = new Faculty("Dr. Arun", "Computer Science");

        s.display();
        c.display();
        f.display();
    }
}
