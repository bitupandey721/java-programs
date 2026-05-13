class Account {
    // Declare balance
    private double balance;

    // Set method (to assign value)
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Get method (to return value)
    public double getBalance() {
        return balance;
    }

    // Display method
    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}
public class Balance{
    public static void main(String[] args) {
        // Create object of Account class
        Account acc = new Account();

        // Set balance
        acc.setBalance(5000.50);

        // Get balance
        double bal = acc.getBalance();
        System.out.println("Balance using get method: " + bal);

        // Display balance
        acc.displayBalance();
    }
}