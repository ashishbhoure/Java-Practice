/*     1
 *   2 3
 * 3 4 5
 */
package Patterns;

import java.util.Scanner;

public class Pattern5 {     qwewq22222222q
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = s.nextInt();
        int i = 1;
        while(i <= n){
            int space = 1;
            while(space <= n-i){
                System.out.print(" ");
                space=space+1;
            }
            int j = 1;
            int val = i;
            while(j <= i){
                System.out.print(val );
                val=val+1;
                j=j+1;
            }
        System.out.println();
        i=i+1;
        } 
    }
}
