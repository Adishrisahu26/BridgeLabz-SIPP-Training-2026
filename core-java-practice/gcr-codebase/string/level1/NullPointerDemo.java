public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        // this will throw NullPointerException
        int len = text.length();
        System.out.println("Length: " + len);
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Accessing length inside try: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling generator inside try/catch to demonstrate exception:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Generator threw: " + e.getClass().getSimpleName());
        }

        System.out.println("Now calling handler method that catches the exception:");
        handleException();
    }
}
