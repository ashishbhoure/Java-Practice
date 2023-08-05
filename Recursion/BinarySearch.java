/*Given an integer sorted array (sorted in increasing order) and an element x, 
find the x in given array using binary search. Return the index of x.
Return -1 if x is not present in the given array. */

package Recursion;

public class BinarySearch {
    public static int binarySearch(int[] input,int start,int end,int element){
        if(start>end){
            return 0;
        }
        int mid = (start+end) /2;
        if(input[mid] == element){
            return mid;
        }else if(input[mid] > element){
            return binarySearch(input,start,mid-1, element);
        }else{
            return binarySearch(input, mid+1, end, element);
        }
    }

    public static int binarySearch(int[] input,int element){
        return binarySearch(input,0,input.length-1,element);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int ele = 3;
        System.out.println(binarySearch(arr, ele));
    }
}
