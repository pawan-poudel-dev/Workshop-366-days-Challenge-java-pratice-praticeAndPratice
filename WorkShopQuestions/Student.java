public class Student {
    private String name;
    private int studentId;
    private int age;
    private String course;
    Student (String name, int studentId, int age,String course){
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.course= course;

    }
    public  String  getName(){
        return name;
    }
    public int getStudentId(){
        return studentId;
    }
    public int getAge(){
        return age;
    }
    public String getCourse(){
        return course;
    }

    
}
class  StudentTest{
    public static void main(String [] args){
        Student obj = new Student("Pawan poudel", 12, 20,"Logic and problem solving");
        Student obj1 = new Student("Ram Bahadur Khanal" , 32,24,"Java");
        Student obj2 = new Student("Sangam Xettri",34,67,"python");
        System.out.println( obj.getName());
        System.out.println( obj.getStudentId());
        System.out.println( obj.getAge());
        System.out.println( obj.getCourse());
        
        System.out.println( "\n\n");

        System.out.println( obj1.getName());
        System.out.println( obj1.getStudentId());
        System.out.println( obj1.getAge());
        System.out.println( obj1.getCourse());
        System.out.println( "\n\n");

        System.out.println( obj2.getName());
        System.out.println( obj2.getStudentId());
        System.out.println( obj2.getAge());
        System.out.println( obj2.getCourse());
        

    }
}
