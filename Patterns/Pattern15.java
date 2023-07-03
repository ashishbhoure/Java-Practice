/* Pattern
    A
    BC
    CDE
    DEFG

 */

package Patterns;
import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j=1;
            char startChar = (char) ('A'+i-1);
            while(j<=i){
                System.out.print(startChar);
                startChar++;
                j++;
            }
            System.out.println();
             i++;
        }
    }
}
