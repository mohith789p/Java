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
    void display(){
        System.out.println("Name: " + name + "\nAge: " + age + "\nSalary: " + salary);
    }
    
}

public class InheritanceEmployee{
    public static void main(String[] args){
        Employee emp = new Employee("Bode", 24,70000);
        emp.display();
    }
}
