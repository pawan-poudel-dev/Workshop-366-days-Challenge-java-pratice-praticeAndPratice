public class Example6 {

    public static void main(String[] args) {

        String original = "I love python";
        String replaced = original.replace("python", "Java");
        System.out.println(replaced);

        // function of split
        String csv = "apple, banana,cherry";
        String[] fruits = csv.split(",");

        for(String fruit : fruits){
            System.out.println(fruit.trim());
        }

    }
}