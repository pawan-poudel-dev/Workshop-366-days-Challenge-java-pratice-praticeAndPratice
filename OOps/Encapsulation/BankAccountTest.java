public class BankAccountTest {
    public static void main(String [] args){
        BankAccount obj = new BankAccount();
        obj.setBalance(-500);//invalid 
        obj.setBalance(2000);//valid
       System.out.println("The output is: " + obj.getBalance());
    }
    
}
