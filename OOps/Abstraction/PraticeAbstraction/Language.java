// create the interface 
interface  Language {
    public void getName(String name);
}
//class implements interface
class ProgrammingLanguage implements Language{
    // implementing the abstract method 
    public void getName(String name){
        System.out.println("ProgrammingLanguage: " + name);
    }

} 
class Mainc{
    public static void main(String [] args){
        ProgrammingLanguage p1 = new ProgrammingLanguage();
        p1.getName("Java ji");
    }
}