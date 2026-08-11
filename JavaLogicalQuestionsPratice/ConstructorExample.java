public class ConstructorExample {
    String name;// this is a instance variable
    ConstructorExample(){
        name = "pawan";
    }
    public static void main(String [] args){
        ConstructorExample s1  =  new ConstructorExample();
        System.out.println(s1.name);
    }
}
