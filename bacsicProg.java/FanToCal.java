import java.util.Scanner;

public class FanToCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp. in ferenhite : ");
        int f = sc.nextInt();
        // int cel = (5/9)*(f - 32); 
        // int cel = (5*(f-32))/9;
        int cel = (int) ((5.0/9)*(f-32)); // bye rxplecitly typecateing becoz whole value comes in double
        System.out.println("temp. in cel is : " + cel);
    }
}
