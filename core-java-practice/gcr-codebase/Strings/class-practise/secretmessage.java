/*2. . Secret Message Validator 
A security application receives a secret code.
Write a program that:
Accepts a string.
Counts vowels, consonants, digits, and special characters.
Determines whether the code is "Strong" or "Weak" based on:
At least 2 digits
At least 1 special character
Minimum length of 8
*/
import java.util.Scanner;   

public class secretmessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter message: ");
        String message = sc.nextLine();
//int vowels = 0, cosonants = 0, digit=0,specialchars = 0,

 int vowels = 0, consonants = 0, digits = 0, specialChars = 0;

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                specialChars++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);

        if (digits >= 2 && specialChars >= 1 && message.length() >= 8) {
            System.out.println("Secret message is Strong.");
        } else {
            System.out.println("Secret message is Weak.");
        }

        sc.close();
    }
}