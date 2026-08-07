public class CheckAge {
    public static boolean isAdult(int age){
       return age >= 18;
    }
    public static void main(String [] args){
        System.out.println(isAdult(20));
        System.out.println(isAdult(15));
    }
}
