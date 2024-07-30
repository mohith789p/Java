import java.util.*;
public class PrimeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Enter an Integer: ");
        num = sc.nextInt();
        sc.close();
        int i,j;
        for (i = 2; i <= num; i++){
            int count = 0;
            for (j = num; j > 0; j--){
                if (i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(i + " ");
            }
        }
    }
}