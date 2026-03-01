// create  an interface 
interface Language1 {
    void getName(String name);
    
}
//class immplements interface 
class ProgrammingLanguage implements Language1{
    //  implementation of the abstract method 
    public void getName(String  name){
  System.out.println("Programmmimng Language :"+ name);
    }
}
class LanguageTest{
    public static void main(String [] args){
        ProgrammingLanguage obj = new ProgrammingLanguage();
        obj.getName("Java"); 
    }
}
