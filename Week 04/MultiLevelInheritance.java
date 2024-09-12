/* Program on Multi Level Inheritance */

import java.util.*;

// super class
class Person {
	String id;
	String name;

	Person(String name, String id) {
		this.name = name;
		this.id = id;
	}

	void attend() {
		System.out.println(name + " is present.");
	}

	void interval() {
		System.out.println(name + " taken break.");
	}

	void eat() {
		System.out.println(name + " having Lunch.");
	}
}

// sub class 1
class Student extends Person {
	int fee;

	Student(String name, String id, int fee) {
		super(name, id);
		this.fee = fee;
	}

	void payFee(int money) {
		fee -= money;
		System.out.println("Amount " + money + " paid sucessfully.");
	}

	void balanceFee() {
		System.out.println(" Amount to pay: " + fee);
	}
}

// sub class 2
class Faculty extends Person {
	int salary;

	Faculty(String name, String id, int salary) {
		super(name, id);
		this.salary = salary;
	}

	void getSalary() {
		System.out.println("Salary (" + salary + ") is credited into your account.");
	}

}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student name,id,fee: ");
		String name = sc.next();
		String id = sc.next();
		int fee = sc.nextInt();
		Student st = new Student(name, id, fee);
		st.attend();
		st.payFee(1000);
		st.balanceFee();
		st.eat();
		System.out.print("Enter faculty name,id,salary: ");
		String fname = sc.next();
		String fid = sc.next();
		int sal = sc.nextInt();
		Faculty fac = new Faculty(fname, fid, sal);
		fac.attend();
		fac.eat();
		fac.getSalary();
		sc.close();
	}
}
