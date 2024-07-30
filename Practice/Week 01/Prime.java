import java.util.*;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Enter an Integer: ");
        num = sc.nextInt();
        sc.close();
        
        int i,count = 0;
        for (i = num; i > 0; i--){
            if (num % i == 0){
                count++;
            }
        }
        System.out.println("Prime: "+ (count == 2));
    }
}