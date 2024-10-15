class Students {
	String name;
	int rollno;
	String branch;
	int marks;
	
	Students (String name, int rollno, String branch){
		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
	}
	
	void marksCalculator(int sub1 ,int sub2, int sub3){
		marks = sub1 + sub2 + sub3;
	}
	void displayDetails(){
		System.out.println("Name: " + name);
		System.out.println("Roll no: " + rollno);
		System.out.println("Branch: " + branch);
		System.out.println("Total Marks: " + marks);
	}
}

class Person{
	public static void main(String[] args){
		Students student = new Students("Rakesh",54,"CSE");
		student.marksCalculator(90,85,80);
		student.displayDetails();
	}	
}
