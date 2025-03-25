

4. public class MethodDemo {

    float a = 0.0f;
    char c;
    String s;

    public static void main(String[] args) {
        MethodDemo m = new MethodDemo();
        System.out.println(m.a);
        System.out.println(m.c);
        System.out.println(m.s);
    }
}
Output

: -
    0.0
    null
    5. public class MethodDemo {

    int a;

    public static void main(String[] args) {
        int a;
        MethodDemo m = new MethodDemo();
        System.out.println(a);
    }
}
Output

: -
    Compilation error: Variable a might not have been initialized.
    Explanation: Local variables must be explicitly initialized before use
    because they do not receive default values like instance variables.
    6. public class MethodDemo {

    int a;

    public static void main(String[] args) {
        int a;
        MethodDemo m = new MethodDemo();
        System.out.println(m.a);
    }
}
Output

: 0
    7. public class MethodDemo {

    int b;

    public static void main(String[] args) {
        int a;
        MethodDemo m = new MethodDemo();
        a = 8;
        System.out.println(a);
    }
}
Output: 8
    Explanation: Java does not allow using uninitialized local variables.
    However, a is explicitly initialized (a = 8;

) before being printed, so the
    program compiles successfully.
    8. public class MethodDemo {

    int a;

    public static void main(String[] args) {
        int a = 5;
        MethodDemo m = new MethodDemo();
        System.out.println(a);
    }
}
Output

: 5
    Can the Instance variable a be accessed inside the main method?
    Yes, an instance variable can be accessed inside the main method,
    but only through an object of the class 


 . To access the instance variable a,
    use the object reference (m.a).
    9. public class MethodDemo {

    static int a;

    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
    }
}
Output

: 5
    Which variable has higher priority when a name conflict arises?
    When a local variable and a class 

 -level (static or

instance) variable
    share the same name, the local variable takes higher priority within the
    method where it is declared.
    10. public class MethodDemo {

    int a;

    public static void main(String[] args) {
        int a = 5;
        MethodDemo m = new MethodDemo();
        {
            int a = 3;
        }
        System.out.println(a);
    }
}
Output

: -
    Compilation error: variable a is already defined in method main(String[])
    Explanation: In Java, a local variable’s scope is limited to the method it is
    declared in, and redeclaring the same variable name within the same
    method (even inside {}) leads to a compilation error.
    11. public class MethodDemo {

    int a;

    public static void main(String[] args) {
        int a = 5;
        MethodDemo m = new MethodDemo();
        {
            a = 3;
        }
        System.out.println(a);
    }
}
Output: 3
    Explanation: The given code compiles successfully and prints 3 because
    the local variable a is modified inside the {} block.
