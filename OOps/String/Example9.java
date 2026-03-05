public class Example9 {
    public static void main(String [] args){

    
    // string concatination in details 
    int age = 20;
    String info ="Age : " + age;// Age : 20
    System.out.println(info);
    // tricky part  but intresting 
    // here java goes from left to right 
    System.out.println(1 + 2 +"apples");// 3 apples
    System.out.println("apples " + 1 + 2);//apples 12
    System.out.println(1 + "apples" + 2);
    }
}
