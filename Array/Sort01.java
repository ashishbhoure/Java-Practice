/* Problem Description:​ ​You are given an integer array A that contains only integers 0and 1. 
Write a function to sort this array. Find a solution which scans the arrayonly once. Don't use extra array */

package Array;
import java.util.Scanner;

public class Sort01 {
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.print("enter the elemennts of array only '0' and '1' : "); 
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

    public static void sort01(int arr[]){
        int nextZero = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp ;
                nextZero += 1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        sort01(arr);
        printArr(arr);
    }
}
