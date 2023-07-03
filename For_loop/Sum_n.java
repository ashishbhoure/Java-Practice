package For_loop;

import java.util.Scanner;

public class Sum_n {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = s.nextInt();

        int sum = 0 ;
        for (int i = 1;i<=n;i++){
            sum = sum +i;
        }
        System.out.println(sum);




        /*
        // by useing While loop
        int i=1;
        int sum =0;
        while(i<=n){
            sum = sum +i;
            i++;
        }
        System.out.println(sum);
        */

    }
}
