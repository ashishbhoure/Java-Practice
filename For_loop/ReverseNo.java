/* Problem Description: ​You are given a number N, then you have to print the reverse of thisnumber N.
For example, if the given number N is 1234, then you have to print 4321 */

package For_loop;
import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enater the series of No. : ");
        int n = s.nextInt();
        int temp = n, rev_num = 0;
        while(temp>0){
            int last_dig = temp%10;
            temp=temp/10;
            rev_num = rev_num*10+last_dig;
        }
        System.out.println(rev_num);
    }
}
