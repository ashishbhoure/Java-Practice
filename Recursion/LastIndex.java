package Recursion;

public class LastIndex {
    public static int lastIndex(int arr[] , int n){
        return lastIndex(arr, n,0);
    }
    private static int lastIndex(int arr[], int n, int startIndex){
        if(startIndex == arr.length){
            return -1;
        }
        int smallans = lastIndex(arr, n, startIndex +1);
        if(smallans != -1){
            return smallans;
        }
        if(arr[startIndex] == n){
            return startIndex;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,5};
        int n = 2;
        System.out.println(lastIndex(arr, n));
    }
}
