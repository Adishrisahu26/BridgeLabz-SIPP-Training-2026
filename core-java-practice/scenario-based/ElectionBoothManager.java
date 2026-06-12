import java.util.Scanner;
public class ElectionBoothManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {

            System.out.print("\nEnter age (-1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                break;
            }

            if (age >= 18) {
                System.out.println("Eligible to vote.");

                System.out.println("Choose a candidate:");
                System.out.println("1. Candidate 1");
                System.out.println("2. Candidate 2");
                System.out.println("3. Candidate 3");

                System.out.print("Enter your vote (1, 2, or 3): ");
                int vote = sc.nextInt();

                switch (vote) {
                    case 1:
                        candidate1Votes++;
                        System.out.println("Vote recorded for Candidate 1.");
                        break;

                    case 2:
                        candidate2Votes++;
                        System.out.println("Vote recorded for Candidate 2.");
                        break;

                    case 3:
                        candidate3Votes++;
                        System.out.println("Vote recorded for Candidate 3.");
                        break;

                    default:
                        System.out.println("Invalid vote!");
                }

            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        System.out.println("\n===== Election Results =====");
        System.out.println("Candidate 1 Votes: " + candidate1Votes);
        System.out.println("Candidate 2 Votes: " + candidate2Votes);
        System.out.println("Candidate 3 Votes: " + candidate3Votes);

        sc.close();
    }
}

