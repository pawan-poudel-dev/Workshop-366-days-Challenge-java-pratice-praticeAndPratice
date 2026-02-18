public class No_Args_Constructors {
    private int i;//instance variable inatialized
    //constructor with no parameter
    private No_Args_Constructors(){
        i = 5;

    } 
    public static void main(String [] args){
        //calling constructor without a parameter 
        No_Args_Constructors obj = new No_Args_Constructors();
        System.out.println("The output of the following is: " + obj.i);
    }

    
}
