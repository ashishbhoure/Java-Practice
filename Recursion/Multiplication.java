/* Multiplication (Recursive)

Given two integers M & N, calculate and return their multiplication using recursion. 
You can only use subtraction and addition for your calculation. No other operators are allowed. */

package Recursion;

public class Multiplication {
    public static int multiplication(int m,int n){
         if(n == 0 || m ==0){
            return 0;
         }
         return m + multiplication(m, n-1);
    }
    public static void main(String[] args) {
        int m=3;
        int n=5;
        System.out.println(multiplication(m, n));
    }
}
