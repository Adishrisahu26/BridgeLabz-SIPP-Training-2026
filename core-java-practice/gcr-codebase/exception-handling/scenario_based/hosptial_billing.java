class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class hosptial_billing {

    public static void processBill(int totalAmount, int items,
                                   int[] patients, int patientIndex,
                                   String inputAmount,
                                   int balance)
            throws InsufficientFundsException {

        try {
            int costPerItem = totalAmount / items;
            System.out.println("Cost per item: " + costPerItem);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        }

        try {
            System.out.println("Patient ID: " + patients[patientIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            int amount = Integer.parseInt(inputAmount);
            System.out.println("Entered Amount: " + amount);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid amount entered.");
        }

        if (totalAmount > balance) {
            throw new InsufficientFundsException(
                    "Payment failed. Insufficient funds.");
        }
    }

    public static void main(String[] args) {
        int[] patients = {101, 102, 103};

        try {
            processBill(1000, 0, patients, 5, "abc", 500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}