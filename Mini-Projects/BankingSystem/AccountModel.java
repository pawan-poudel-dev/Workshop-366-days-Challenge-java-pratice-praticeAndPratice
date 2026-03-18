
public class AccountModel {
    private double balance = 1000.0;  // Initial balance
    private String history = "Initial: Rs:1000 \n";

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            history += "Deposit: +" + amount + " | Balance: " + balance + "\n";
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        double fee = amount * 0.01;  // 1% fee
        double total = amount + fee;
        if (amount > 0 && total <= balance) {
            balance -= total;
            history += "Withdraw: -" + amount + " (fee: " + fee + ") | Balance: " + balance + "\n";
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
    public String getHistory() {
        return history;
    }
}
