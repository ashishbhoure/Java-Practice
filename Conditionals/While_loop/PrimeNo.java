package Conditionals.While_loop;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No. :");
        int n = sc.nextInt();
        int d = 2;

        while(d<n){
            if(n%d == 0){
                System.out.println("Not a Prime No.");
                return;
            }
            d = d+1;
        }
        System.out.println("No. is Prime");
    }
}
