class TwoDArrayUsingEENHANCEDfORlOOP{
    public static void main(String [] args){
        int [] [] arr = {
            {20,40,50},
            {60,70,80}
        };
        for(int[] row:arr){
            for( int value :row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}