// 4. Write a program with an if statement. Declare one variable inside the if block and another one outside. 
//Print both variables inside and outside the if block to understand variable scope. 
//(Comment the compiler error in your program while submitting)

public class IfElseDeclaration {

    public static void main(String[] args) {
        int outsideVariable = 10;

        if (outsideVariable > 5) {
            int insideVariable = 20;
            System.out.println("Inside if block: Outside Variable = " + outsideVariable);
            System.out.println("Inside if block: Inside Variable = " + insideVariable);
        }

        System.out.println("Inside if block: Outside Variable = " + outsideVariable);
        //System.out.println("Inside if block: Inside Variable = " + insideVariable);

        // The following line would cause a compilation error because insideVariable is not accessible outside the if block
        // System.out.println("Outside if block: Inside Variable = " + insideVariable);
    }
}
