public class Multi_Dimensional_ArrayUsingLoop {
    public static void main(String [] args){
        int [][]a ={{1,-2,3},
        {-4,-5,9,8},
        {9},
    };
    for(int i = 0;i<a.length;i++){
        for(int j= 0;j<a[i].length;j++){
            System.out.println(a[i][j]);
        }
    }
    }
    
}
