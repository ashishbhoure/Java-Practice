/* ProblemDescription:​Given a number N,find its squareroot.You need to find and print only the integral part of square root of N.
For example, if the number given is 18, it’s square root is  */

package For_loop;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the a No. : ");
        int n = s.nextInt();
        int result = 0;
        while(result*result <= n){
            result++;
        }
        System.out.println(result-1);
    }
}
