import java.util.*;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter an Integer: ");
        num = sc.nextInt();
        sc.close();
        if (num % 2 == 0){
            System.out.println(num + " is a Even number.");
        }
        else {
            System.out.println(num + " is a Odd number.");
        }
    }
}