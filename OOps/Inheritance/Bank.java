public class Bank{
    public  double rateOfInterest(){

        return 5;
        


    }
}
 class NabilBank extends Bank{
    @Override
    public double rateOfInterest(){
        return 9;
    }
}
class Main{
        public static void main (String [] args){
            Bank b  = new Bank();
            System.out.println( "Bank returns :"+ b.rateOfInterest());
            Bank b2 = new NabilBank();
            System.out.println( "The nabol bank returns :"+b2.rateOfInterest());

        }
    

}