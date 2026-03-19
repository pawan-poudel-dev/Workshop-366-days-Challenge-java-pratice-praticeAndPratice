public class PrintingInArrays {
    public static void main(String [] args){
        int sum = 0;
       int[]numbers = new int[5]; 
       numbers[0] = 100;
       numbers[1]= 200;
       numbers[2]= 300;
       numbers[3]= 400;
       numbers[4]= 500;
       for(int i = 0; i<numbers.length;i++){
        sum+= numbers[i];
        System.out.println(numbers[i]);

       }
       System.out.println(sum);
    }
    
}
