import java.util.*;

public class Calculator{

	public static void main(String[] args) {
		int a,b,ch,result;
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Product\n4.Division\n");
		System.out.print("Enter your choice: ");
		ch = sc.nextInt();
		sc.close();
		switch(ch){
			case 1:
				result = a+b;
				System.out.println("Addition: "+ result);
				break;
			case 2:
				result = a-b;
				System.out.println("Subtraction: "+ result);
				break;
			case 3:
				result = a*b;
				System.out.println("Product: "+ result);
				break;
			case 4:
				result = a/b;
				System.out.println("Quotient: "+ result);
				result = a%b;
				System.out.println("Remainder: "+ result);
				break;
			default:
				System.out.print("INVALID!");
		}
	}
}
