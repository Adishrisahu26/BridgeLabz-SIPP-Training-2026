class atm_withdrawl extends Exception {

    private double balance;
    private double requestedAmount;

    public atm_withdrawl(double balance,
                                        double requestedAmount) {
        super("Insufficient balance");
        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}