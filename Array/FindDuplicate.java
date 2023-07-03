/* Problem Description: ​You are given with an array of integers of size n which contains numbersfrom 0 to n - 2. 
Each number is present at least once. That is, if n = 5, 
numbers from 0 to 3 ispresent in the given array at least once and one number is present twice.
 You need to find andreturn that duplicate number present in the array */

package Array;
import java.util.Scanner;

public class FindDuplicate {

    public static int findDuplicate(int arr[]){
        for(int i=0;i<(arr.length-1);i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elementes of array : ");
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
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }
}
