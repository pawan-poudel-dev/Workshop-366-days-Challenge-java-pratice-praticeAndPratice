public class PerfectlyDivisible {
    public static void main(String [] args){
        int num= 67;
        if(num %3 ==0 && num % 5 == 0){
            System.out.println("The given number is perfectly divisible by 3 and 5:" + num);
        }else{
            System.out.println("Number is not divisible by  3 and 5");
        }
    }
    
}
