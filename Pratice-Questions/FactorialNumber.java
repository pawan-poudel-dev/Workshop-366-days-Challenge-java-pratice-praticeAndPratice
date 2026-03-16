public class FactorialNumber {
    public static void main(String[] args){
        int number = 5;
         long factorial = 1;
         /*for(int i = 1;i <= 6; i++){
            factorial =  factorial *i;

         }
         System.out.println(factorial);
          */



         for( int i = number;i >= 1;i--){
            factorial = factorial *i;
            System.out.print("  " + factorial);


         }
         System.out.println( " " + factorial);
    }
    
}
