public class SmallestDigit {
    public static void main(String [] args){
        int min = 9;
        int num = 89672354;
        while(num!=0){
            int digit = num%10;// gets the last digit 
            if(digit< min){
                min = digit;
            }
            num = num/10;// removes the last digit 
        }
            System.out.println("The smallest number of the digit is :" + min);
    }
    
}
