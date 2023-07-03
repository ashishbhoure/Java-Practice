/* Pattern
    D
    CD
    BCD
    ABCD

 */

package Patterns;
import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j=1;
            char ch = (char) ('A'+n-i);
            while(j<=i){
                System.out.print(ch);
                ch++;
                j++;
            }
            System.out.println();
             i++;
        }
    }
}
