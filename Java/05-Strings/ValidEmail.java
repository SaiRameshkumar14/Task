
public class ValidEmail {

    static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        if (atIndex < 1 || dotIndex < atIndex + 2 || dotIndex == email.length() - 1) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidEmail("test@example.com"));
        System.out.println(isValidEmail("test@.com"));
        System.out.println(isValidEmail("test@com"));
    }
}
