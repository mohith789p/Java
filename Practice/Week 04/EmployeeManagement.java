class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    String work() {
        return name + " is working";
    }

    double getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    String work() {
        return super.work() + " and managing team and overseeing projects.";
    }

}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    String writeCode() {
        return super.work() + " and writing the code.";
    }
}

class EmployeeManagement {
    public static void main(String[] args) {
        Manager manager = new Manager("Rahul", 80000);
        Developer developer = new Developer("Ravi", 60000);
        System.out.println("Name: " + manager.getName() + " and Salary: " + manager.getSalary());
        System.out.println(manager.work());
        System.out.println("Name: " + developer.getName() + " and Salary: " + developer.getSalary());
        System.out.println(developer.work());
        System.out.println(developer.writeCode());
    }
}