public class TestAccount {
    public static void main(String [] args){
        //saving account obj 
        SavingAccount obj = new SavingAccount();
        obj.interest();// calls saving account version 
        CurrentAccount obj1 = new CurrentAccount();
        obj1.interest();
    }
    
}
