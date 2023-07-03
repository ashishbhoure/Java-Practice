package Array_2D;

import java.util.Scanner;

public class Array2D {
     // take inpute form user.
    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the no. of colums : ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for(int i = 0; i<rows;i++){
             for(int j=0;j<cols;j++){
                System.out.print("Enter element at: "+i+" , "+j + " : ");
                arr[i][j] = sc.nextInt();
             }
        }
        return arr;
    }

    // for print
    public static void print2Darr(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i = 0; i<rows;i++){
             for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" "); 
             }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        // int arr2D[][] = new int[2][3];
        // System.out.println(arr2D[1][2]);
        // arr2D[1][2] = 20;
        // System.out.println(arr2D[1][2]);

        // int arr2[][] = {{1,2,3,4},{1,5,9,5}};
        
        int arr[][] = takeInput();
        print2Darr(arr);
        
    }   
}
