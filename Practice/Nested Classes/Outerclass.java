class Outerclass {
    private int outerValue = 25;

    class InnerClass {
        void print() {
            System.out.println("Outer value is: " + outerValue);
        }
    }

    public static void main(String[] a) {
        InnerClass inner = new Outerclass().new InnerClass();
        inner.print();
    }
}
