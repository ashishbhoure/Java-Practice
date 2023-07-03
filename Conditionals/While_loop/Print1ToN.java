package Conditionals.While_loop;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        int i = 1;

        while(i <= n){
            System.out.println(i);
            i = i+1;
        }

    }
}
