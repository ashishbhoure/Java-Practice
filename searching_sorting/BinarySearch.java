/* Problem Description:​ ​Given a sorted integer array (in ascending order) and anelement x. 
You need to search this element x in the given input array usingbinary search. 
Return the index of element in the input. If element is not found inthe array, return -1 */

package searching_sorting;
import java.util.Scanner;

public class BinarySearch {

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

     public static int binarySearch(int arr[] , int x){
        int start = 0;
        int end = arr.length-1;
        int mid = start;
        while(start <= end){
            mid = start + (end-start) /2;
            if(arr[mid]>x){
                end = mid-1;
            }else if(arr[mid] < x){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
     }
     
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = takeInput();
        System.out.println("Enter tha value u want to search : ");
        int x = s.nextInt();
        int val = binarySearch(arr, x);
        if(val == -1){
            System.out.println("value is not present in array ");
        }else{
            System.out.println("value found at index : "+val);
        }
    }
}
