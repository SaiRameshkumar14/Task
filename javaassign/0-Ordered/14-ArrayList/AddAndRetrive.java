
import java.util.ArrayList;

public class AddAndRetrive {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Third fruit: " + fruits.get(2));
    }
}
