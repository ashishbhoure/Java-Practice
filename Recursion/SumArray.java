package Recursion;

public class SumArray {
    public static int sum(int arr[]){
        return sum(arr,0);
    }
    public static int sum(int arr[] , int startIndex){
        if(arr.length == startIndex){
            return 0;
        }
        return arr[startIndex] + sum(arr,startIndex+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,-2};
        System.out.println(sum(arr));
    }
}
