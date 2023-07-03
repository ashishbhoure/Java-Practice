package program;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("User Input");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. one ");
        // int a = sc.nextInt();
        float a = sc.nextFloat();

        
        System.out.println("Enter no. two ");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        // int sum = a+b;
        float sum = a+b;
        
        System.out.println("the sum is:");
        System.out.println(sum);
        
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);

        // String 
        String str = sc.next(); // give forst word only 
        System.out.println(str);
        String str1 = sc.nextLine(); // give whole line 
        System.out.println(str1);
    }
}
