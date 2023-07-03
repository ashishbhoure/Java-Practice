/* ProblemDescription:​Given a binary number as an integer N,you need to convert it into decimal and print it.
For example, if the given binary number is 1100, 
then the decimal number corresponding to thisnumber is 12, so, print it as output */

package For_loop;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a binary no : ");
        int n = s.nextInt();
        int decimal = 0, pow = 1;
        while(n>0){
            int last = n%10;
            decimal += last*pow;
            pow *= 2;
            n = n/10;
        }
        System.out.println(decimal);
    }
}
