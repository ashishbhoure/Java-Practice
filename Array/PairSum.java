/* Problem Description:​ ​Given a random integer array A and a number x. 
Find andprint the pair of elements in the array which sum to x. 
Array A can containduplicate elements */

package Array;
import java.util.Scanner;

public class PairSum {

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

    public static int PairSum(int arr[] , int x){
        int numPairs = 0;
        for (int i=0; i<arr.length; i++) { 
            for(int j = i + 1; j < arr.length; j++) { 
                if(arr[i] + arr[j] == x) {
                    System.out.println(arr[i]+" "+arr[j]);
                    numPairs += 1;
                }
            }
        }
        return numPairs;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = takeInput();
        printArr(arr);
        System.out.println("Enter a num u want pair sum : ");
        int x= s.nextInt();
        int pair = PairSum(arr, x);
        System.out.println("num of pairs is : " + pair);
    }
}
