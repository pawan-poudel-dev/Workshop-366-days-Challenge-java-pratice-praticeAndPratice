import java.util.*;
public class NestedLoopsIN2DArray {
    public static void main (String [] args){
Scanner sc = new Scanner(System.in);
int [][] arr= new int[3][3];
System.out.println("Enter 9 Numbers :");
// input 
for(int i = 0; i<3; i++){
    for(int j = 0;j<3;j++){
        arr[i][j]= sc.nextInt();
    }
}

System.out.println("Array is :");
for(int i = 0;i<3;i++){
    for(int j = 0;j<3;j++){
        System.out.print(arr[i][j]  + " ");

    }
    System.out.println();
}
sc.close();
    }
    
}
