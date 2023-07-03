package Conditionals.if_else;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three nos.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

    //     if(a>=b && a>=c){
    //         System.out.println(a + " is largest no.");
    //     }else{
    //         if(b>=a && b>=c){
    //             System.out.println(b + " is largest no.");
    //         }
    //         else{
    //             System.out.println(c + " is largest no.");                
    //         }
    //     }


    // another method for do same program

        if(a>=b &&a>=c){
            System.out.println(a +" is largest No.");
        }
        else if(b>=a && b>=c){
            System.out.println(b +" is largest No.");
        }
        else{
            System.out.println(c + " is largest No.");
        }
        
    }
}
