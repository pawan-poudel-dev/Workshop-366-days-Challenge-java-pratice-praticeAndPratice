public class ChangeDataTypeOfOverloading {
    //this method accepts int 
    private static void display(int a){
        System.out.println("God integer data :" + a);
    }
    private static void display(int a ,int b){
        System.out.println("The sum ogf the methods are :" + (a +  b));
    }
    public static void main(String args[]){
        display(23);
        display(34,90);
    }
    
}
