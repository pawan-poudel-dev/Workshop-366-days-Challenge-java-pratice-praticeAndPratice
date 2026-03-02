public class TShapeStarPattern {
    public static void main(String[] args){
       int i,j;// firstly, we have to find **************** pattern 
       for( i = 1;i<= 1;i++){
        for(j = 8;j>=i;j--){
            System.out.print("*");
        }
       }
       for(i = 1;i<= 5;i++){
        for(j = 5;j>=i;j--){
            System.out.println("*");
        }
       }
       for(i = 1;i<=8;i++){
        for(j = 1;j<=i;j++){
            System.out.println("*");
        }
       } 
    }
    
}
