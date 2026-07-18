public class SumOfArrayElements {
    public static void main(String [] args){
        int [] numbers = {12,56,78,9,34,67,89,90,8};
        int sum = 0;
        for(int summation:numbers){
            sum += summation;
        }
        System.out.println(sum);
    }
    
}
