/* Pattern 
 *         *
 *        ***
 *       *****
 *      *******
 */

package Patterns;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class PatternStar1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int space=1;
            while(space <= n-i){
                System.out.print(" ");
                space = space + 1;
            }
            int j=1;
            while(j<=2*i-1){
                System.out.print("*");
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
