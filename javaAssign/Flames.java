package javaAssign;
//     static String flamesFinding(String name1, String name2) {
//         String[] flames = {"F", "L", "A", "M", "E", "S"};
//         name1.replaceAll(" ", "");
//         name2.replaceAll(" ", "");
//         int index = (name1.length() + name2.length()) % 6;
//         return flames[index];
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter GROOM Name : ");
//         String groom = scan.nextLine();
//         System.out.print("Enter BRIDE Name : ");
//         String bride = scan.nextLine();
//         System.out.println(flamesFinding(groom, bride));
//     }
// }

public class Flames {

    public static void main(String[] args) {
        Status status = Status.ACTIVE;
        System.out.println(status.getValue()); // Output: 1

        status.setValue(2); // Changing the value

        Status sta = Status.INACTIVE;
        System.out.println(status.getValue()); // Output: 2

        for (Status s : Status.values()) {
            System.out.println(s.value);
        }
    }
}

enum Status {
    ACTIVE(1), INACTIVE(0);

    public int value;

    Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        this.value = newValue;
    }
}
