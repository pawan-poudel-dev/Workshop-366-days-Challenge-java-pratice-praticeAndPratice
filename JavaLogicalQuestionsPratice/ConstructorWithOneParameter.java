public class ConstructorWithOneParameter {
    String name ;
    int age;
    int grade;
    int roll_No;
    ConstructorWithOneParameter(String name,int age, int grade, int roll_No) {
        this.name = name;
        this.age = age;
        this.grade= grade;
        this.roll_No=roll_No;
    }
    public static void main(String [] args){
        ConstructorWithOneParameter s1 = new ConstructorWithOneParameter("Pawan",20,13,1);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.grade);
        System.out.println(s1.roll_No);

    }
}
