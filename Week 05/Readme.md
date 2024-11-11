# Exercise - 5

> ## a) Write a JAVA program give example for “super” keyword.

## Code

```java
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
```

## Output

```text
FROM PERSON CLASS:
Name: Shiva
Age: 18

FROM EMPLOYEE CLASS:
Name: Rahul
Age: 25
Salary: 500000.0
```

> ## b) Write a JAVA program to implement Interface. What kind of Inheritance can be achieved?

## Code

```java

interface Vehicle {
    void start();

    void stop();
}

interface mileage {
    void displaymileage();
}

class Bike implements Vehicle, mileage {

    @Override
    public void start() { // public is must
        System.out.println("Bike is starting");
    }

    public void stop() {
        System.out.println("Bike is stopping");

    }

    public void displaymileage() {
        System.out.println("Bike milage is 50Km/l");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.displaymileage();
        b.stop();

    }
}
```

## Output

```text
Bike is starting
Bike milage is 50Km/l
Bike is stopping
```

> ## c) Write a JAVA program that implements Runtime polymorphism.

## Code

```java

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
```

## Output

```text
DBMS has 5 units
JAVA has 5 units
```
