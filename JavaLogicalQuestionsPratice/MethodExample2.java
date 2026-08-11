public class MethodExample2 {
    String getName(){
        return "pawan";
    }
    public static void main(String [] args){
        MethodExample2 me = new MethodExample2();
        String name = me.getName();
        System.out.println(name);
    }
}
