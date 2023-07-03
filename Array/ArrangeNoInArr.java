package Array;

import java.util.Scanner;

public class ArrangeNoInArr {

    public static int[] arrange(int n){
        int left =0;
        int right=n-1;
        int curr =1;
        int arr[] = new int[n];
        while(left<=right){
            if(curr%2 == 1){
                arr[left] = curr;
                curr++;
                left++;
            }else{
                arr[right]=curr;
                curr++;
                right--;
            }
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
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of no : ");
        int n = s.nextInt();
        int result[] = arrange(n);        
        System.out.print("Arraged array is : ");
        printArr(result);
    }
}
