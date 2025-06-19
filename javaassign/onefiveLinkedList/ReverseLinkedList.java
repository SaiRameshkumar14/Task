
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        reverseAndPrint(list);
    }

    public static void reverseAndPrint(LinkedList<Character> list) {
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
    }
}
