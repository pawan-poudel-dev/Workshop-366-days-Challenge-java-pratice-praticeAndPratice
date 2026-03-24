public class Addition1 {
    public Addition1(int a, int b){
        System.out.println("Sum is:" +(a+b));
    }
    public Addition1(int a , int b, int c){
        System.out.println("Sum is :" + (a+b+c));
    }
    public Addition1(String fName,String LName){
        System.out.println(fName +" "+ LName);

    }
    public static void main(String [] args){
        Addition1  a1 = new Addition1(12,34);
        Addition1 a2 = new Addition1(12,34,56);
        Addition1 a3 = new Addition1("Pawan","poudel"); 
    }
}
