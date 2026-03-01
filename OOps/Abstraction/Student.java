class Student{
    String name;
    int age;
    public void display(){
        System.out.println("Your name and age is: " +  name +  ""+age );
    }
    public static void main (String args[]){

    
        Student b1 =  new Student();
        b1.name= "pawan poudel";
        b1.age = 21;
        Student b2 = new Student();
        b2.name = "Ayusha";
        b2.age = 21;
        b1.display();
        b2.display();
    }
}