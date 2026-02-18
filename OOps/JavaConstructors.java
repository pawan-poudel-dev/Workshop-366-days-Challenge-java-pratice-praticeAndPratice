public class JavaConstructors {
    private String name;
    //decleration of the constructor 
    JavaConstructors(){
        System.out.println("Here ! constructor is called.");
        name = "pawan poudel";


    }
public static void main(String [] args){
    // constructor is invoked while
    //creatimg an object of the javaConstructors class
    JavaConstructors obj = new JavaConstructors();
    System.out.println("The name  is : "+ obj.name );


}
    
}
