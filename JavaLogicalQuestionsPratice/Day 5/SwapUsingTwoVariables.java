public class SwapUsingTwoVariables {
    public static void main(String [] args){
        // Basically, we can use mathematical formula to encounter this question
        int a = 56;
         int b = 78;
         // first step,
        a = a+b;
        b = a-b;
        a = a -b;
        System.out.println("A: " + a +"B:" + b);
    }
}
