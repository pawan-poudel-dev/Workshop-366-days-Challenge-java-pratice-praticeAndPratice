public class BankAccount {
    private double balance;

    public void setBalance(double amount){
        this.balance = amount;
        if(balance <0){
            System.out.println("Balance cannot be negative. please enter  a valid amount");
        }else{
            this.balance= amount;
        }
    }
    public double getBalance(){
        return balance;
    }
}
