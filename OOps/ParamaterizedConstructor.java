public class ParamaterizedConstructor {
    String language;
     ParamaterizedConstructor(String lang){
        language = lang;

System.out.println( language + " "+ "is a programming langage");
    }
    public static void main(String [] args){
//call constructor bu passing a single value
ParamaterizedConstructor obj = new ParamaterizedConstructor("java" + " ");
ParamaterizedConstructor obj1 = new ParamaterizedConstructor("python actually" + "");
    }
    
}
