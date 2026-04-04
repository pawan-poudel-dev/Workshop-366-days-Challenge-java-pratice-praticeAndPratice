public class SumNumbers {
    public static void main(String [] args){
        // this can be done in mainly two ways using mathematical formula:
        //i.e (n(n+1))/2 and next is using loops
        // here, we wil use loop to calculate the sum of numbers
        int i;
        int sum = 0;
        for(i = 1;i<=100; i++){
            sum+=i;
        }
        System.out.println("The sum of the Natural numbers is:"+sum);
    }
    
}
