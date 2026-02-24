public class AnotherExampleOfConstructor {
    String languages;
    AnotherExampleOfConstructor(String lang){
        this.languages = lang;
        System.out.println("The programming language is " + languages);
    }
public static void main(String [] args){
    // call constructor by passing a single value 
    AnotherExampleOfConstructor obj = new AnotherExampleOfConstructor("python");
    AnotherExampleOfConstructor obj1 = new AnotherExampleOfConstructor("java");
    AnotherExampleOfConstructor obj3  = new AnotherExampleOfConstructor("c");
}
    
}
