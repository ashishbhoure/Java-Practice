/* Problem Description: ​You are given with a number N and a choice C. If the user enters C equalto 1, then print sum of 1 to N numbers, but if user enters C equal to 2, then print product of 1 toN numbers and if user enters any other value of C then print - */

package For_loop;
import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of N and your choice : ");
        int n = s.nextInt();
        int choice = s.nextInt();
        if(choice == 1){
            int sum = 0;
            for(int i =1;i<=n;i++){
                sum = sum +i;
            }
            System.out.println(sum);
        }
        if(choice == 2){
            int product = 1;
            for(int i =1;i<=n;i++){
                product = product * i;
            }
            System.out.println(product);
        }
        if(choice != 1 && choice != 2){
                System.out.println(-1);
            }
    }
}
