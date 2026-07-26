import java.util.*;

public class TakingInputExampleInArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr= new int[5][5];// here we have create a 5 * 5  5 rows and 5 columns 
        System.out.println("Enter 25 Numbers :");
        int i , j;
        for( i = 0; i<5;i++){
            for(j = 0; j<5;j++){
             arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Now, The array is :  ");
      for (i = 0;i<5;i++){
        for(j = 0;j<5;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
sc.close();
    }

}
