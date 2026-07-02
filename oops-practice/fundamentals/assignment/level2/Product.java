class Product {

    static double discount = 10;

    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void display() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Product ID: " + productID);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {

        Product p = new Product("Laptop", 60000, 2, 1001);

        updateDiscount(15);

        if (p instanceof Product) {
            p.display();
        }
    }
}