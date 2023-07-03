/* Problem Description: ​In this question, you are given with a number N, you have to print thesum of all even number till N */

package Conditionals.While_loop;

import java.util.Scanner;

public class SumOf_n_EvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No. :");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
         while(i<=n){
            sum = sum + i;
            i=i+2;
         }
         System.out.println("the sum is  : " + sum);

    }
}
