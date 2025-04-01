
public class ZS {

    public static void main(String[] args) {
        ZSGSStudent student_1 = new ZSGSStudent("Adam", 12);
        ZSGSStudent student_2 = new ZSGSStudent("Parent", 43, "Child", 10);

        student_1.Repr();
        student_2.Repr();
    }
}

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class ZSGSStudent extends Student {

    String childName;
    int childAge;

    ZSGSStudent(String parent_name, int parent_age) {
        super(parent_name, parent_age);
    }

    ZSGSStudent(String parent_name, int parent_age, String child_name, int child_age) {
        super(parent_name, parent_age);
        this.childName = child_name;
        this.childAge = child_age;
    }

    void Repr() {
        System.out.println("Parent Name: " + name + "\t Age: " + age);
        System.out.println("Child Name: " + childName + "\t Age: " + childAge);
    }
}
