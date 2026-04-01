public class Test10 {
    public static void main(String [] args){
        int [] []a={
            {1,2,3},
            {4,5,6}

        };
        int count=0;
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                if(a[i][j]%2==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}
