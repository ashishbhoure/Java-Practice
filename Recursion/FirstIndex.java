/* Problem Description:​ ​Given an array of length N and an integer x,
 you need to findand return the first index of integer x present in the array. 
 Return -1 if it is notpresent in the array */

package Recursion;

public class FirstIndex {
    public static int firstIndex(int arr[],int n){
        return firstIndex(arr, n,0);
    }
    private static int firstIndex(int arr[],int n,int startIndex){
        if(startIndex == arr.length){
            return -1;
        }
        if(arr[startIndex] == n){
            return startIndex;
        }
        return firstIndex(arr, n, startIndex+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4,2,5};
        int n = 4;
        System.out.println(firstIndex(arr, n));
    }
}
