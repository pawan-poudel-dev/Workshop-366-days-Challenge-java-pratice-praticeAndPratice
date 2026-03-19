public class ArrayExample3 {
    public static void main(String [] args){
       int numbers[] ={10,20,30,40,50};
       int sum = 0;
       for(int i = numbers.length-1;i>= 0;i--){
        sum+= numbers[i];
        System.out.println(numbers[i]);
       } 
       System.out.println(sum);
    }
    
}
