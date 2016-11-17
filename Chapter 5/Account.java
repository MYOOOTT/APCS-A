import java.text.NumberFormat;

public class Account {
    private final double RATE = 0.035; // interet rate of 3.5%
    private int acctNumber;
    private double balance;
    private String name;

    //sets ups the acount by defining its owner, account number,
    // and initial balance.
    public Account (String owner, int account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    //Deposits the specified amount into the account. Returns the 
    //new balance.
    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    //Withdraws the specified amount from the account and applies
    //the fee. Returns the new balance
    public double withdraw(double amount, double fee) {
        balance = balance - amount - fee;
        return balance;
    }

    public double addInterest() {
        balance += (balance * RATE);
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return acctNumber;
    }

    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}
