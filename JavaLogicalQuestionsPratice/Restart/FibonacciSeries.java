public class FibonacciSeries {
    public static void main(String [] args){
         int a = 0;;
         int b =1;
         int c ;
         for(int i = 0; i<= 5; i++){
             c = a +b;
             System.out.println(c);
             // computing the next term
             a = b ;
             b = c;
         }
    }
}
