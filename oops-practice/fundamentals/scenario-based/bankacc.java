//Design a simple BankAccount class that models real-world banking behavior. Each account should store basic details like account number, holder name, and balance.

/*You will implement methods to deposit and withdraw money, ensuring that withdrawals don't exceed the available balance. The class should also keep track of how many accounts have been created using a static variable.

Finally, create multiple accounts and simulate transactions to observe how the system behaves.

Key Points
Create a class with accountNumber, holder, and balance.
Implement deposit() and withdraw() with proper balance checks.
Add getStatement() to display account details.
Use a static variable to count total accounts created.
Create 3 accounts and perform 5 transactions on each.*/
class BankAccount {
    private int accountNumber;
    private String holder;
    private double balance;


static int totalAccounts = 0;




}
