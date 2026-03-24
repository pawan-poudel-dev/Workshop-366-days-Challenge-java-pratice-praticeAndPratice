public class Addition2 {
    //  getting the concept of the method over;oading 
    public void add(int a, int b){
        System.out.println("Sum is:" + (a+b));
    }
    public void add(int a, int b, int c){
        System.out.println("Sum is :" + (a+b+c));
    }
    public void test(){
        add(1,2);
        add(1,2,3);
    }
    
}
