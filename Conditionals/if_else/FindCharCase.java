/* Problem Description: ​In the given problem, you have to print 1 if the input character isuppercase, 0 if  it is lowercase, or -1 if it is an invalid character.
For example:if input character is ‘A’ output should be 1
if input character is ‘a’ output should be 0
if input character is ‘*’ output should be -1 */

package Conditionals.if_else;

import java.util.Scanner;

public class FindCharCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char c = sc.next().charAt(0);
        if(c>='A' && c<='Z'){
            System.out.println(1);
        }else if(c>='a' && c<='z'){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }
    }
}
