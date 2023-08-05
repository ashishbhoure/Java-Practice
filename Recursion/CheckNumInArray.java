package Recursion;

public class CheckNumInArray {
    public static boolean checkNum(int arr[],int x){
        return checkNum(arr, x ,0);
    }
    public static boolean checkNum(int arr[],int x,int startIndex){
        if(startIndex == arr.length){
            return false;
        }
        if(arr[startIndex] == x){
            return true;
        }
        return checkNum(arr, x, startIndex +1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int x = 8;
        System.out.println(checkNum(arr, x));
    }
}
