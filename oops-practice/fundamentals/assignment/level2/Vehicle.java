class Vehicle {

    static double registrationFee = 1500;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void display() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle: " + vehicleType);
        System.out.println("Registration No: " + registrationNumber);
        System.out.println("Fee: " + registrationFee);
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle("Adishri", "Car", "UP80AB1234");

        updateRegistrationFee(2000);

        if (v instanceof Vehicle) {
            v.display();
        }
    }
}