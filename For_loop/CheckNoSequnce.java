/* ProblemDescription:You are given a sequence of numbers and you have to check whether it is possible to split the sequence into 2 parts such that 
1st part is strictly decreasing while the other part is strictly increasing.
Thatis,in the sequence if the numbers are decreasing,they can start to increase at one point.
And once the numbers start increasing, they cannot decrease at any point furth */

package For_loop;
import java.util.Scanner;

public class CheckNoSequnce {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the sequence of No. : ");
        int n = s.nextInt();
        int prev = s.nextInt();
        int count =2,current;
        boolean isDec = true;
        while(count<= n){
            current = s.nextInt();
            count++;
            if(current == prev){
                System.out.println(false);
                return;
            }
            if(current < prev){
                if(isDec == false){
                    System.out.println(false);
                    return;
                }
            }else{
                if(isDec == true){
                    isDec = false;
                }
            }
            prev = current;
        }
        System.out.println(true);
    }
}
