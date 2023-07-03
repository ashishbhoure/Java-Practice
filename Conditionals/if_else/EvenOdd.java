package Conditionals.if_else;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("My no. is even");
            return;
        }
        else{
            System.out.println("My no. is odd");
        }
        System.out.println("program runed !!");
    }
}
