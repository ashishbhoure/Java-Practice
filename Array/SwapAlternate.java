package Array;

import java.util.Scanner;

public class SwapAlternate {
    public static void swapAlternat(int arr[]){
        for(int i=0;i<arr.length-1;i=i+2){
            int temp = arr[i];
            arr[i]= arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.print("enter the elemennts of array : "); 
        for(int i=0;i<size;i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void printArr(int arr[]){
        int size = arr.length;
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" "); 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        printArr(arr);
        swapAlternat(arr);
        printArr(arr);
    }
}
