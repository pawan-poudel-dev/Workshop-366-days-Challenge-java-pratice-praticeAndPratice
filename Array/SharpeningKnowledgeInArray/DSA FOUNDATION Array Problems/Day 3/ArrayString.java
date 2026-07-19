public class ArrayString {
    public static void main(String[] args) {
        String[] names = { "pawan", "naman", "Shristi", "Aayushma", "projina" };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
        System.out.println(names[2]);
        names[4] = "hanuman";
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
        }
    }

}
