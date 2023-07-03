/* Problem Description: ​In this problem you are given with two random integer arrays, you haveto print their intersection.
That is, you have to print all the elements that are present in both thegiven arrays.
For example: If input is: Size1 of arr1=6                                                 
arr1[] =  2 6 8 5 4 3                                        
Size2 of arr2= 4                                                 
arr2[] = 2 3 4 7Output: Elements present in both the arrays:2 3 4  */

package Array;
import java.util.Scanner;

public class ArrayIntersection {

    public static void findIntersection(int arr1[],int arr2[]){
        System.out.print("Intersection of array is : ");
        for(int i =0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");                    
                    arr2[j] = Integer.MIN_VALUE;
                    break; 
                }
            }
        }
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
        System.out.println("Enter the array 1 ");
        int arr1[] = takeInput();
        System.out.println("Enter the array 2 ");
        int arr2[] = takeInput();
        System.out.print("Array 1 is : ");
        printArr(arr1);
        System.out.print("Array 1 is : ");
        printArr(arr2);
        findIntersection(arr1, arr2);
    }
}
