public class Demo {
    int num;
    Demo(int num){
        this.num = num;
    }
    
}
class Test15{
    public static void main(String [] args){
        Demo d = new Demo(5);
        System.out.println(d.num);
    }
}