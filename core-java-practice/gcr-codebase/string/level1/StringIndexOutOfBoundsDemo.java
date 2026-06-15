import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String s) {
        // access char beyond length to throw exception
        System.out.println("Char at invalid index: " + s.charAt(s.length()));
    }

    public static void handleException(String s) {
        try {
            System.out.println("Attempting invalid access inside try: " + s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("Calling generator inside try/catch:");
        try {
            generateException(input);
        } catch (RuntimeException e) {
            System.out.println("Generator threw: " + e.getClass().getSimpleName());
        }

        System.out.println("Now calling handler that catches the exception:");
        handleException(input);
        sc.close();
    }
}
