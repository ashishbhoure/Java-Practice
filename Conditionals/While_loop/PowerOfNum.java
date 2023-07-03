
/* Problem Description: ​You are given a number x and another number n. 
You have to print x^n (x raised to the power n).
For example, if x=3 and n=2 then, you have to print 9 () */

package Conditionals.While_loop;
import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of x and n (x^n) : ");
        int x = s.nextInt();
        int n = s.nextInt();
        int ans = 1;
        while(n > 0){
            ans = ans * x;
            n = n-1;
        }
        System.out.println("the result is : "+ ans);
    }
}
