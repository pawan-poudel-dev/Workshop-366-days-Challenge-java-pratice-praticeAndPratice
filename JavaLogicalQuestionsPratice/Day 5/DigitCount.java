public class DigitCount {
    public static void main(String [] args){
        int count = 0;
        int n = 1234566778;
        int digit;
        while(n != 0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
