package Array;

import java.util.Scanner;

public class InputArr {

    public static int largestArr(int arr[]){
        int max =Integer.MIN_VALUE;
        for(int i=0;i< arr.length ;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printInput(int arr[]){
        int size = arr.length;
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" "); 
        }
        System.out.println();
    }

    public static void increment(int i){
        i++;
    }
    public static void incrementArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }


    public static void main(String[] args) {
        // int arr[] = takeInput();
        // printInput(arr);
        // int largest = largestArr(arr);        
        // System.out.println("largest : " +largest);

        //for primitive datatype address of i is difrfrent
        int i =10;
        increment(i);
        System.out.println(i);
        
        //for non-primitive datatype address of arr is same  pass by refrrance
        int arr[] = {1,2,3,4};
        incrementArr(arr);
        printInput(arr);
    }
}
