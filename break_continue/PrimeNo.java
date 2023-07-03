/* Problem Description: ​You are given an input integer N, 
and you have to print all the primenumbers between 2 to N (both inclusive) in different lines.
For example, if the given number is 7, 
then the prime numbers between 2 to 7 will be 2,3,5 and 7which must be printed in different lines in the output. */

package break_continue;
import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = s.nextInt();
        for(int i =2;i<=n;i++){
            boolean isPrime = true;
            for(int j =2;j<i;j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }   
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
