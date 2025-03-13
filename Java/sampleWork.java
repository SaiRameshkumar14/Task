
public class sampleWork {

    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        String count = "";
        for (int i = 0; i < args.length; i++) {
            System.out.println(count += args[i]);
        }
        System.out.println(count);
    }
}
