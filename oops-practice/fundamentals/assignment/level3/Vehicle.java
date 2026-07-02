class Vehicle {

    String vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void displayCars(Vehicle[] vehicles) {

        System.out.println("\nCars");

        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                System.out.println(v.vehicleNumber + " " + v.ownerName);
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {

        System.out.println("\nBikes");

        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                System.out.println(v.vehicleNumber + " " + v.ownerName);
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Vehicle("UP80A101","Adishri","Car"),
            new Vehicle("UP80A102","Riya","Bike"),
            new Vehicle("UP80A103","Rahul","Car"),
            new Vehicle("UP80A104","Aman","Bike"),
            new Vehicle("UP80A105","Priya","Car"),
            new Vehicle("UP80A106","Rohan","Bike"),
            new Vehicle("UP80A107","Ankit","Car"),
            new Vehicle("UP80A108","Neha","Bike"),
            new Vehicle("UP80A109","Sakshi","Car"),
            new Vehicle("UP80A110","Karan","Bike")
        };

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}