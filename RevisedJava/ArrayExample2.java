public class ArrayExample2 {
    public static void main(String [] args){
        int [] numbers = {10,20,30,30,40,50};
        int  sum = 0;
        // using for each loop
        for(int number: numbers){
            sum+= number;
            System.out.println(number);
        }
        System.out.println(sum);
    }
    
}
