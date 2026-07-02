class BankAccount {

    String accountNumber;
    String holder;
    double balance;

    static int totalAccounts = 0;

    BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " Deposited");
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " Withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void getStatement() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder : " + holder);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("A101", "Adishri", 10000);
        BankAccount a2 = new BankAccount("A102", "Riya", 15000);
        BankAccount a3 = new BankAccount("A103", "Rahul", 12000);

        // 5 Transactions for Account 1
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.deposit(500);
        a1.withdraw(3000);
        a1.deposit(1000);

        // Account 2
        a2.deposit(4000);
        a2.withdraw(2000);
        a2.deposit(1500);
        a2.withdraw(500);
        a2.deposit(700);

        // Account 3
        a3.deposit(3000);
        a3.withdraw(1000);
        a3.deposit(500);
        a3.withdraw(7000);
        a3.deposit(2000);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("\nTotal Accounts = " + totalAccounts);
    }
}