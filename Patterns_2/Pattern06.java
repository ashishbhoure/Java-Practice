/* Patterns
 *  1111
 *  222
 *  33
 *  4
 */

package Patterns_2;
import java.util.Scanner;

public class Pattern06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n = s.nextInt();
        int i=1;
        while(i<=n){
            int j = 1;
            while(j<=n-i+1){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
