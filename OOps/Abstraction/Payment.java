public  abstract class Payment {
    private double amount;
    // abstract method dosent  conssist body 
    // constructor built 
    Payment(double amount){
        this.amount = amount;
    }
    abstract void processPayment();
    // concrete methods have body and can be implements
     public void paymentReceipt(){
        System.out.println("Payment of Rs."+ amount+   "is  successful");
     }
}


 class EsewaPayment extends Payment{
    
    public EsewaPayment(double amount){
        super(amount);

    }
    @Override
    public void processPayment(){
        System.out.println("Processing via Esewa.......");
    }
 }
 class BankTransferPayment extends Payment{
    BankTransferPayment(double amount){
        super(amount);
    }
    @Override
    public void processPayment(){
        System.out.println("Processing via Bank Transfer.........");
    }
 }
 class Prototype{
    public static void main(String [] args){
        // use of  the polymorphism 
        Payment p1 = new BankTransferPayment(1234);
        Payment p2 = new EsewaPayment(345.890);
        Payment[]p ={p1,p2};// create a object of paymemt  from the array 
        for(Payment b : p){
            b.processPayment();
            b.paymentReceipt();
        }
    }
 }