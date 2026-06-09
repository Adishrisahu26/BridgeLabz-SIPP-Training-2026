class volumeofearth{
    public static void main(String[] args) {

        double radiusInKm = 6378;
        double pi = 3.14159265359;

        double volumeInKmCube =
                (4.0 / 3.0) * pi *
                Math.pow(radiusInKm, 3);

        double kmToMiles = 1.6;
        double radiusInMiles =
                radiusInKm / kmToMiles;

        double volumeInMilesCube =
                (4.0 / 3.0) * pi *
                Math.pow(radiusInMiles, 3);

        System.out.println(
                "The volume of earth in cubic kilometers is "
                + volumeInKmCube +
                " and cubic miles is "
                + volumeInMilesCube
        );
    }
}