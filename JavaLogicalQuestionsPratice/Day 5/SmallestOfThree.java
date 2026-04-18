public class SmallestOfThree {
    public static void main(String [] args){
        // finding the smallest of the three numbers
         int a = 45;
          int b = 46;
           int c= 90;
            if( a < b && a< c){
                System.out.println("Smallest is A");
            }
            else if(b < a && b< c){
                System.out.println("Smallest number is B");

            }
            else{
                System.out.println("Smallest  is C");
            }
    }
}
