import java.util.Scanner;

public class The_Coffee_Counter_Chronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter coffee type (Espresso, Latte, Cappuccino) or 'exit': ");
            String coffeeType = sc.nextLine();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting!");
                break;
            }

            int price = 0;

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;

                case "latte":
                    price = 150;
                    break;

                case "cappuccino":
                    price = 180;
                    break;

                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // consume newline

            double bill = price * quantity;
            double gst = bill * 0.18; // 18% GST
            double totalBill = bill + gst;

            System.out.println("\n----- BILL -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Bill Amount : ₹" + bill);
            System.out.println("GST (18%)   : ₹" + gst);
            System.out.println("Total Bill  : ₹" + totalBill);
            System.out.println("----------------\n");
        }

        sc.close();
    }
}

