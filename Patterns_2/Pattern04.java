/* Patterns
 *  ****
 *   ***
 *    **
 *     *
 */

package Patterns_2;
import java.util.Scanner;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n = s.nextInt();
        int i=1;
        while(i<=n){
            int j = 1;
            while(j<=i-1){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=n-i+1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
