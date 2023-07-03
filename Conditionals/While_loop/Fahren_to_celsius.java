package Conditionals.While_loop;

import java.util.Scanner;


public class Fahren_to_celsius {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start , end and step values : ");
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();

        int curr_val = S;

        System.out.println("fah  |  cel");
        while(curr_val<=E){
            int cel = (int)((5.0/9)*(curr_val - 32));
            System.out.println(curr_val  + "\t|\t" + cel );
            curr_val = curr_val + W;
        }
    }
}
