import java.util.Scanner;
public class Add2Num_UI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No : ");
        int i = sc.nextInt();
        System.out.print("Enter 2st No : ");
        int j = sc.nextInt();

        int sum = i +j ;
        System.out.println("Th sum of given no is : "+ sum);

    }
}
