import java.util.Scanner;

public class spyagency {

    public static String reverseMessage(String message) {
        return new StringBuilder(message).reverse().toString();
    }

    // Check palindrome
    public static boolean isPalindrome(String message) {
        String reversed = reverseMessage(message);
        return message.equalsIgnoreCase(reversed);
    }

    public static void countVowelsAndConsonants(String message) {
        int vowels = 0;
        int consonants = 0;

        message = message.toLowerCase();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }
    public static char firstNonRepeatingCharacter(String log) {
        for (int i = 0; i < log.length(); i++) {
            char ch = log.charAt(i);

            if (log.indexOf(ch) == log.lastIndexOf(ch)) {
                return ch;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter secret message: ");
        String message = scanner.nextLine();

        String reversed = reverseMessage(message);
        System.out.println("Reversed Message: " + reversed);

        if (isPalindrome(message)) {
            System.out.println("Message is a Palindrome");
        } else {
            System.out.println("Message is NOT a Palindrome");
        }

        countVowelsAndConsonants(message);
        System.out.print("Enter first intercept: ");
        String intercept1 = scanner.nextLine();

        System.out.print("Enter second intercept: ");
        String intercept2 = scanner.nextLine();

        if (areAnagrams(intercept1, intercept2)) {
            System.out.println("Intercepts are Anagrams");
        } else {
            System.out.println("Intercepts are NOT Anagrams");
        }
        System.out.print("Enter surveillance log: ");
        String log = scanner.nextLine();

        char result = firstNonRepeatingCharacter(log);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        scanner.close();
    }
}