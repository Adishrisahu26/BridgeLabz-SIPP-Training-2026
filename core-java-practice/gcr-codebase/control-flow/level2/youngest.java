import java.util.Scanner;

public class FriendsDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amar Age: ");
        int amarAge = sc.nextInt();
        System.out.print("Amar Height: ");
        double amarHeight = sc.nextDouble();

        System.out.print("Akbar Age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Akbar Height: ");
        double akbarHeight = sc.nextDouble();

        System.out.print("Anthony Age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Anthony Height: ");
        double anthonyHeight = sc.nextDouble();

        // Youngest
        if (amarAge < akbarAge && amarAge < anthonyAge)
            System.out.println("Youngest: Amar");
        else if (akbarAge < amarAge && akbarAge < anthonyAge)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        // Tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight)
            System.out.println("Tallest: Amar");
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
    }
}