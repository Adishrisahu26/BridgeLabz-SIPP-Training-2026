class track {
    int itemCode;
    String itemName;
    double price;

    track(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        track item = new track(101, "Laptop", 50000);

        item.displayDetails();

        int quantity = 2;
        System.out.println("Total Cost: " +
                item.calculateTotalCost(quantity));
    }
}