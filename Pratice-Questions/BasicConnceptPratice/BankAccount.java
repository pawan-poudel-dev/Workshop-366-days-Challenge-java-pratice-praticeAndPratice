class BankAccount{
    String owner;
    double balance;
    BankAccount(String owner, double balance){
        this.owner = owner;
         this.balance = balance;
    }
    // instance  method : belongs to object , returnx double
    double getBalance(){
        return balance;

    }
    // instance method : void - performs , no  return 
    void deposit(double amount){
        if(amount >0) balance += amount;
    else System.out.println("Invalid amount");
        }
        // instance method : returns boolean 
        boolean withdraw(double amount){
            if(amount <= balance){
                balance -= amount;
                return true;

            }
             return false;
        }

`
    }
     class Banktest{
        public static void maion(String [] args){
            BankAccount acc = new BankAccount("Pawan poudel",120000);
            acc.deposit(50000);
            System.out.println(acc.getBalance());
            Boolean ok = acc.withdraw(3000);
            System.out.println("withdraw: " + ok);
        }
     }

