//3. Create multiple classes in single file and compile and explore how many .class files are generated.

public class MultipleClass {

    public static void main(String[] args) {
        System.out.println("Original");
    }
}

class DuplicateOne {

    public static void main(String[] args) {
        System.out.println("Duplicate 01");
    }
}

class DuplicateTwo {

    public static void main(String[] args) {
        System.out.println("Duplicate 02");
    }
}

class DuplicateThree {

    public static void main(String[] args) {
        System.out.println("Duplicate 03");
    }
}
