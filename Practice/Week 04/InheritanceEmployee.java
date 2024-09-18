class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
   
    void display(){
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

class Employee extends Person{
    double salary;

    Employee(String name, int age, double salary){
        super(name,age);
        this.salary = salary;
    }

    // override
    @Override
    void display(){
        System.out.println("Name: " + name + "\nAge: " + age + "\nSalary: " + salary);
    }
    
}

public class InheritanceEmployee{
    public static void main(String[] args){
        Person p = new Person("Rahul", 20);
        Employee emp = new Employee("Bode", 24,70000);
        p.display();
        emp.display();
    }
}
