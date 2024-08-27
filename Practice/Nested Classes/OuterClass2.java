public class OuterClass2 {
    private int outerValue = 25;

    class InnerClass {
        void print() {
            System.out.println("Outer value is: " + outerValue);
        }
    }

    public static void main(String[] a) {
        InnerClass inner = new OuterClass2().new InnerClass();
        inner.print();
    }
}