
class Subjects {
    void chapters() {
        System.out.println("Every subject has 10 units");
    }
}

class DBMS extends Subjects {
    @Override
    void chapters() {
        System.out.println("DBMS has 5 units");
    }
}

class JAVA extends Subjects {
    @Override
    void chapters() {
        System.out.println("JAVA has 5 units");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        DBMS d = new DBMS();
        d.chapters();
        JAVA j = new JAVA();
        j.chapters();
    }
}