class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String compareAges(Person p1, Person p2) {
        if (p1.age == p2.age)
            return p1.name + " and " + p2.name + " have same age.";
        else if (p1.age > p2.age)
            return p1.name + " is older than " + p2.name + ".";
        else
            return p2.name + " is older than " + p1.name + ".";
    }
}

public class People {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 50);
        Person p2 = new Person("Bob", 30);
        String result = Person.compareAges(p1, p2);
        System.out.println(result);
    }
}