/* Program on Multi Level Inheritance */

import java.util.*;

// super class
class Person {
	String id;
	String name;
	
	Person(String name){
		this.name = name;
	}
	void attend(){
		System.out.println(name + " is present.");
	}
	void interval(){
		System.out.println(name + " taken break.");
	}
	void eat(){
		System.out.println(name + " having Lunch.");
	}
}

// sub class 1
class Student extends Person{
	int fee;
	
	Student(String name, String id, int fee){
		super(name, id);
		this.fee = fee;
	}
	void payFee(int money){
		fee -= money;
		System.out.println("Amount " + money + "paid sucessfully.");
	}
	void balanceFee(){
		System.out.println(" Amount to pay: " + fee);
	}
}

// sub class 2
class Faculty extends Person{
	int salary;
	
	Student(String name, String id,int salary){
		super(name, id);
		this.salary = salary;
	}
	void getSalary(int money){
		System.out.println("Salary (" + money + ") is credited in your account.");
	}
	
}

public class MultiLevelInheritance{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student name,id,fee: ");
		String name = sc.next();
		String id = sc.next();
		int fee = sc.nextInt();
		Student() st = new Student();
	}
}
