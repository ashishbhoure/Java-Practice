/* Problem Description: ​You are given an input integer N, and you have to calculate the sum of itsodd and even digits separately.For example, if the given number is 24321, then sum of it’s even digit=2+4+2=8 and odddigits=3+1=4. */

package Conditionals.While_loop;
import java.util.Scanner;

public class Sum_of_Even_Odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        while(num > 0){
            int last_digit = num % 10;
            if(last_digit % 2 == 0){
                evenSum = evenSum + last_digit;
            }else{
                oddSum = oddSum + last_digit;
            }
            num = num / 10;
            System.out.println(last_digit +" "+ num);
        }
        System.out.format("Even sum : %d , Odd Sum : %d", evenSum ,oddSum);
    }
}
