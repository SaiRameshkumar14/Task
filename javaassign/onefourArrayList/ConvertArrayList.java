
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        // Convert ArrayList to Array
        String[] array = list.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));

        // Convert Array back to ArrayList
        ArrayList<String> newList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + newList);
    }
}
