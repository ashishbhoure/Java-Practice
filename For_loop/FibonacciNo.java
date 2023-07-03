/* Problem Description: ​You are given an input integer N,
 and you have to calculate the NthFibonacci number.
For example, if the given number is 7, 
then the Fibonacci series will be 1,1,2,3,5,8,13,........ Then13 will be the 7th fibonacci number */

package For_loop;
import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = s.nextInt();
        int a=1;
        int b=1;
        for(int i = 1;i<n;i++){
            int c= a+b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }
}
