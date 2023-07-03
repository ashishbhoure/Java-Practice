/* Problem Description: ​Given an integer array of size 2N + 1. In this given array,
 N numbers arepresent twice and one number is present only once in the array. 
 You need to find and return thatnumber which is unique in the array.For example:
 size= 7                    
 arr[] = 2 3 1 6 3 6 2
 Output: 1 */

package Array;
import java.util.Scanner;

public class FindUnique {

    public static int findUnique(int arr[]){
        for(int i =0;i<arr.length;i++){
            int j=1;
            for(j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        break;
                    }
                }
            }
            if(j == arr.length){
                return arr[i];
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
        // findUnique(arr);
        int unique = findUnique(arr);
        System.out.println(unique);
    }
}
