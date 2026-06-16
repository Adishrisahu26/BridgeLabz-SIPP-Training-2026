public class celcuis {

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double poundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    static double kgToPounds(double kg) {
        return kg * 2.20462;
    }

    static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    static double litersToGallons(double liters) {
        return liters * 0.264172;
    }
}