// here we will use multiple  constructors and methods and try to solve the realworld project
public class Example4 {
    String  owner;
    double balance;
    // constructor
    Example4(String owner, double balance){
        this.owner = owner;
        this.balance = balance;

    }
    // mehthod turn
    void deposit(double amount){
        balance = balance + amount;
    }
    //method
    void withdraw(double amount){
        balance = balance - amount;
    }
    void showBalance(){
        System.out.println(balance);
    }
    public static void main(String [] args){
        Example4 account = new Example4("Pawan",1000);
        account.deposit(500);
        account.withdraw(500);
        account.showBalance();
        account.withdraw(500);
        account.showBalance();
    }
}
