public class HierarchicalInheritanceTest {
    public static void main(String[] args) {
        

        ClassB b = new ClassB();
        b.dispB();
        b.dispA();

        ClassC c = new ClassC();
        c.dispC();
        c.dispA();

        ClassD d = new ClassD();
        d.dispD();
        d.dispA();
    }
}