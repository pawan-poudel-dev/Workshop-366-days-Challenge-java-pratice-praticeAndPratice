public class MethodReturnType {
    public int myMethod(int x){
        return 5 +x;
    }
    public static void main(String[] args ){
        MethodReturnType example = new MethodReturnType();
        System.out.println(example.myMethod(3));
    }
}
