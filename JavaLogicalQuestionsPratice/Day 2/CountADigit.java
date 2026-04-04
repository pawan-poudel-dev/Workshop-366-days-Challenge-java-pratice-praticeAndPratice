public class CountADigit {
    public static void main(String [] args){
        int count = 0;
        int num = 234567;
        while(num!= 0){
            int digit = num %10;// gets the last digit 
             num = num/10;
             count++;
        }
        System.out.println("The counting number for the digit is :"+" "+count);
    }
}
