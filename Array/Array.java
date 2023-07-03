package Array;

import java.util.Scanner;

// without using input
public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter tha size of array : ");
        int size = s.nextInt();
        int input[] = new int[size];
        System.out.println("Enter the elment of array : ");
        for(int i=1;i<size;i++){
            input[i] = s.nextInt();
        }
        for(int i=1;i<size;i++){
            System.out.print(input[i]);
        }
        System.out.println();
    }
}
