// printing al;l the 2d arrays
public class ArrayExample4 {
    public static void main(String [] args){
            int [][]a= {
            {1,-1,-2,3}, {-4,-5,6,9},{9}};
            for(int i = 0;i<= a.length-1;i++){
                for(int j =0;j<a[i].length;j++){
                    System.out.println(a[i][j]);
                }
            }
}
}