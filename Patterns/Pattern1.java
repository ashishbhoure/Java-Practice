/* 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 */

package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j <= i){
                System.out.print(j);
                j =j+1;
            }
            System.out.println();
            i=i+1;
        }

    }

    // public static void main(String[] args) {
    //     for (int i=1;i<=7;i++){
    //         for(int j=1;j<=(i<=4?(2*i-1):(i));j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
}
