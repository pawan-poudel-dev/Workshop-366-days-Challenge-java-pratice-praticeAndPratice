public class SmallestDigit {
    public static void main(String [] args){
         int n = 2334156;
         int digit;
          int min = 9;// always insert higest possible number
         while(n!=0){
             digit = n %10; // gets the last digit
             // now,compare the digit
             if(digit <min){
                 min = digit;
             }
             n = n/10;

         }
         System.out.println(min);
    }
}
