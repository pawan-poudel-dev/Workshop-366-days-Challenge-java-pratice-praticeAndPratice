class Person{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
class myClass{
    public static void main(String [] args){
        Person myObj =  new Person();
        myObj.setName("Pawan");
        System.out.println(myObj.getName()); 
    }
}