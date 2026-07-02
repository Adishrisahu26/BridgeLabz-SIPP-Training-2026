class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 8.5;

    String stationId;
    double unitsConsumed;

    ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println("Station ID : " + stationId);
        System.out.println("Units : " + unitsConsumed);
        System.out.println("Bill : " + calculateBill());
    }

    public static void main(String[] args) {

        ChargingStation[] s = {
            new ChargingStation("S1",100),
            new ChargingStation("S2",120),
            new ChargingStation("S3",90),
            new ChargingStation("S4",80),
            new ChargingStation("S5",150)
        };

        electricityRate = 10;

        for(ChargingStation c : s){
            c.displayStationDetails();
            System.out.println();
        }

        System.out.println("Total Stations : " + totalStations);
    }
}