/* Problem Description: ​You are given a number x and you have to print the first x numbers of theAP series 3N+2 which are not multiples of 4 . */

package For_loop;
import java.util.Scanner;

public class TermAP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = s.nextInt();
        int count = 1, n=1;
        while(count <= x){
            int num = 3*n+2;
            if(num %4 !=0){
                System.out.println(num);
                count++;
            }
            n++;
        }
    }
}
