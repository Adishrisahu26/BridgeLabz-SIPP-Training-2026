import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String s, int start, int end) {
        // intentionally throw IllegalArgumentException when start > end
        if (start > end) throw new IllegalArgumentException("start index > end index");
        System.out.println("Substring: " + s.substring(start, end));
    }

    public static void handleException(String s, int start, int end) {
        try {
            generateException(s, start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught runtime exception: " + e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        System.out.println("Calling generator (may throw):");
        try {
            generateException(s, start, end);
        } catch (RuntimeException e) {
            System.out.println("Generator threw: " + e.getClass().getSimpleName());
        }

        System.out.println("Now calling handler that catches the exception:");
        handleException(s, start, end);
        sc.close();
    }
}
