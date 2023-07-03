/* Problem Description: ​You are​​given with a number N, you have to figure out if it is a memberof 
Fibonacci series or not. Return true if the number is member of Fibonacci series else false */

package Functions;

import java.util.Scanner;

public class FibonacciMember {
    public static boolean isFibonacci(int n){
        int a=0;
        int b=1;
        while(a<n){
            int c=a+b;
            a=b;
            b=c;
        }
        if(a==n){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a no. which u want to find is fibonacci : ");
        int n = s.nextInt();
        System.out.println(isFibonacci(n));;
    }
}
