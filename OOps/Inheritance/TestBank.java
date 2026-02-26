public class TestBank {
    public static void main(String [] args){
        Bank b = new NabilBank();// parent refrence , child object
        System.out.println("Rate of interest " +  b.rateOfInterest());
    }
    
}
