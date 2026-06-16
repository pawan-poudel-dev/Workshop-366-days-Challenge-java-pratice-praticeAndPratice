public class OneInAnotherTriangle {
    public static void main(String [] args){
        int i ,j ,k,l;
        for(i = 0;i <= 5;i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            for(k = 0;k <= 4;k++){
                for(l = 4 ;l>= k;l--){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

