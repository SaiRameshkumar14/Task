
import java.util.LinkedList;
import java.util.Queue;

public class QueueSimulation {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Diana");

        queue.poll(); // Remove "Alice"
        queue.poll(); // Remove "Bob"

        System.out.println("Remaining in queue: " + queue);
    }
}
