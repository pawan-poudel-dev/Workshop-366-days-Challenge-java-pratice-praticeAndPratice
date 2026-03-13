public class LargestDigitNumber {
    public static void main(String [] args){
        int num = 45867;
        int largestNumber= 0;
         while(num!= 0){
            int digit = num%10;// extracts number from the  last 
            if(largestNumber < digit){
                largestNumber = digit;
                 
            }
            num/=10; // eliminates the last digit 
            }
           
             System.out.println(largestNumber);
         }
          
    }
    

