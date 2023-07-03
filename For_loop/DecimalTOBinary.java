/* ProblemDescription:Givenadecimalnumber(integerN),youhavetoconvertitintobinaryand print it. 
The binary number should be printed in the form of an integer.
For example, if the given decimal number is 12,then the corresponding binary number will be1100, 
and we need to print it. */

package For_loop;
import java.util.Scanner;

public class DecimalTOBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the binary No. : ");
        int n = s.nextInt();
        int binary_num=0 , place_v = 1;
        while(n>0){
            int rem = n%2;
            binary_num += rem*place_v;
            place_v=place_v*10;
            n=n/2;
        }
        System.out.println(binary_num);
    }
}
