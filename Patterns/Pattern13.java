/* Pattern
    ABCD
    BCDE
    CDEF
    DEFG

 */

package Patterns;
import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j=1;
            char startingChar = (char) ('A'+i-1);
            while(j<=n){
                System.out.print(startingChar);
                startingChar++;
                j++;
            }
            System.out.println();
             i++;
        }
    }
}
