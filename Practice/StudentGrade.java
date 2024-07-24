import java.util.*;

public class StudentGrade{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int marks;
		String grade;
		System.out.print("Enter your Marks: ");
		marks = sc.nextInt();
		sc.close();
		if (marks > 90)
			grade = "A";
		else if (marks> 80)
			grade = "B";
		else if (marks> 70)
			grade = "C";
		else if (marks> 60)
			grade = "D";
		else if (marks> 50)
			grade = "E";
		else
			grade = "Failed";
		
		System.out.println("You Grade: "+ grade);
	}
}
