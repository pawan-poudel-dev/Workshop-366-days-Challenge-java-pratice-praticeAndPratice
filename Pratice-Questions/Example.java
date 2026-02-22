public class Example {
    void print(int x){
        System.out.println("int");
    }
    void print(char c){
        System.out.println("char");
    }

    
}
public class Test19{
    public static void main(String [] args){
        Example t = new Example();
        t.print('A');
        t.print(65);

    }
}
