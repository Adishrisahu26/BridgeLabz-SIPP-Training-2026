class math_wizard {
    int value = 100;
    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }
        return fact;
    }
    public int fibonacci(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Power
    public long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    // Scope Demonstration
    public void showScope() {
        int value = 50; // Local variable

        System.out.println("Local Variable: " + value);
        System.out.println("Instance Variable: " + this.value);
    }
}

public class Main {
    public static void main(String[] args) {

        MathWizard mw = new MathWizard();

        System.out.println("Is 17 Prime? " + mw.isPrime(17));

        System.out.println("Factorial(5) = " + mw.factorial(5));

        System.out.println("Factorial(6.0) = " + mw.factorial(6.0));

        System.out.println("Fibonacci(8) = " + mw.fibonacci(8));

        System.out.println("GCD(24, 36) = " + mw.gcd(24, 36));

        System.out.println("LCM(12, 18) = " + mw.lcm(12, 18));

        System.out.println("Power(2, 5) = " + mw.power(2, 5));

        System.out.println("\nScope Demonstration:");
        mw.showScope();
    }
}