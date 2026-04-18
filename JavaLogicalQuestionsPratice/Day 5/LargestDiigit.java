public class LargestDiigit {
    public static void main(String [] args){
        int  n = 45765;
        int digit;
        int max = 0;
        while (n != 0){
            digit = n %10;// gets the last digit
            if(digit > max){
                max = digit;
            }
            n = n/10;// removes the last digit
        }
        System.out.println("The largest number is : " + max);
    }
}
