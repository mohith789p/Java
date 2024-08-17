class OuterClass {
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside Static Nested Class");
        }
    }

    class InnerClass {
        void display() {
            System.out.println("Inside Inner Class");
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        // for non static, outer class instance is needed.
        InnerClass inner = outer.new InnerClass();
        // for static, no outer class instance is needed.
        StaticNestedClass StaticNested = new StaticNestedClass();
        StaticNested.display();
        inner.display();
    }
}