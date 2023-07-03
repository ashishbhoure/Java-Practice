/* Pattern
    1
    21
    321
    4321
 */

package Patterns;
import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i-j+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
