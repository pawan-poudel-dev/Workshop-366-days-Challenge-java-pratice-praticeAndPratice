public class TrianglePattern {
        String name;
        int age;
        float marks;

        TrianglePattern(String name, int age, float marks){
            this.name =  name;
            this.age = age;
            this.marks = marks;

        }
        void display(){
           System.out.println("Name:" + name +
                   "Age: "+" "+ age +
                   "Marks: "+" "+ marks);
    }
    public static void main(String [] args){
            TrianglePattern  obj = new TrianglePattern("pawan",20,89);
            obj.display();
    }

}
