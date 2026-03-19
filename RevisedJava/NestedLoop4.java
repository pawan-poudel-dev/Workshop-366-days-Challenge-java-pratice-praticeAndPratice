public class NestedLoop4 {
    public static void main(String [] args){
        int i,j;
        for(i= 1;i<= 7;i++){
            for(j=7;j>= i;j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    
}
