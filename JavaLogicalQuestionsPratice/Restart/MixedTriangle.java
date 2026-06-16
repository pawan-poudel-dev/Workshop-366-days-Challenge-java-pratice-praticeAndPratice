public class MixedTriangle {
    public static void main(String [] args){
         int i , j , k , l;
         for(i = 0 ; i <= 5; i++){
             for(j = 0; j<= i;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
         for( k = 1; k <= 5;k++){
             for(l = 5;l >= k;l--){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
