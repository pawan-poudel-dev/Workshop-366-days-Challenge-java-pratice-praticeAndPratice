public class MultipleConstructor {
    String name;
    int age;
    MultipleConstructor(){
        name = "pawan";
        age = 0;
    }
    MultipleConstructor(String name){
        this.name = name;
        age = 0;

    }
    MultipleConstructor(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        MultipleConstructor s1 = new MultipleConstructor();
        MultipleConstructor s2 = new MultipleConstructor("Pawan");
        MultipleConstructor s3 = new MultipleConstructor("Pawan",22);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);


    }
}
