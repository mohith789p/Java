class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age); // calling construction in super class
        this.salary = salary;
    }

    @Override
    void display() {
        super.display(); // calling method in super class
        System.out.println("Salary: " + salary);

    }
}

public class Super {
    public static void main(String[] args) {
        Person p = new Person("Shiva", 18);
        Employee emp = new Employee("Rahul", 25, 500000);
        System.out.println("FROM PERSON CLASS: ");
        p.display();
        System.out.println();
        System.out.println("FROM EMPLOYEE CLASS: ");
        emp.display();
    }
}