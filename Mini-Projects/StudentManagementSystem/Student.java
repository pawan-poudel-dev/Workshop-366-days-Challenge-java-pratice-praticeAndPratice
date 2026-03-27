public  class Student{
    private String name;
    private int age;
    private int id;
    Student(int id, String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;

    }
    public String  getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    public void display(){
        System.out.println("ID:"+ id+
                           "|  Name:"+ name+
                           "| Age:"+ age);
        
    }

}