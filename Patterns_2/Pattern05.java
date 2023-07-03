/* Patterns
 *  4444
 *  333
 *  22
 *  1
 */

package Patterns_2;
import java.util.Scanner;

public class Pattern05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n = s.nextInt();
        int i=1;
        while(i<=n){
            int j = 1;
            while(j<=n-i+1){
                System.out.print(n-i+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
