/* Problem Description:​ ​Given a random integer array A and a number x. 
Find and print the triplate of elements in the array which sum to x. 
Array A can containduplicate elements */

package Array;
import java.util.Scanner;

public class PairTriplat {

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

    public static int PairTriplate(int arr[] , int x){
        int numTriple = 0;
        for (int i=0; i<arr.length; i++) { 
            for(int j = i + 1; j < arr.length; j++) { 
                for(int k = j + 1; k < arr.length; k++) { 
                    if(arr[i] + arr[j] + arr[k]== x) {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        numTriple +=1;
                    }
                }
            }
        }
        return numTriple;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = takeInput();
        printArr(arr);
        System.out.println("Enter a num u want pair sum : ");
        int x= s.nextInt();
        int pairs = PairTriplate(arr, x);
        System.out.println("Num of pairs are : "+pairs);
    }
}
