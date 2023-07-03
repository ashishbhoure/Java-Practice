package Array;

import java.util.Scanner;


public class LinearSearch {

    public static int[] takeInput(int size){
        Scanner s = new Scanner(System.in);
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int linearSearch(int arr[],int val){
        for(int i=0;i<=arr.length;i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = s.nextInt();
        int arr[] = takeInput(size);
        System.out.print("Enter the value oyou want to print : ");
        int val = s.nextInt();
        int result = linearSearch(arr, val);
        if(result == -1){
            System.out.println("Enter value is not Found");
        }else{
            System.out.println("Enter value is forunt at the position : "+ result);
        }
    }
}
