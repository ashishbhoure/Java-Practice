package Complexity;

public class RotateArray {

    public static void swapElement(int[] arr, int start,int end){
        int temp = arr[start];
        arr[start] =arr[end];
        arr[end]= temp;
    }

    public static void reverse(int[] arr,int start,int end){
        while(start < end){
            swapElement( arr, start, end);
            start++;
            end--;
        }
    }

    public static void rotate(int[] arr, int d){
        if(arr.length == 0){
            return;
        }
        if(d >= arr.length && arr.length != 0){
            d %= arr.length;
        }

        reverse( arr, 0, arr.length-1);
        reverse( arr, 0, arr.length-d-1);
        reverse( arr, arr.length-d, arr.length-1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int d= 2;
      rotate(arr, d);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
      }
    }
}
