/* merge sort recursion .. very fart sorting algorithem  */
package Recursion;

public class MergeSort {
    public static void mergeSort(int arr[]){
        if(arr.length <= 1){
            return;
        }
        int mid = arr.length /2;
        int part1[] = new int[mid];
        int part2[] = new int[arr.length - mid];
        for (int i =0;i< mid;i++ ){
            part1[i] = arr[i];
        }
        int k=0;
        for(int i=mid;i<arr.length;i++){
            part2[k] = arr[i];
            k++;
        }

        
        mergeSort(part1);
        mergeSort(part2);
        merge(part1,part2,arr);
    }

    public static void merge(int part1[],int part2[],int output[]){
        int i=0,j=0,k=0;
        while(i<part1.length && j<part2.length){
            if(part1[i] < part2[j]){
                output[k] = part1[i];
                k++;
                i++;
            }else{
                output[k] = part2[j];
                k++;
                j++;
            }
        }
        while(i<part1.length){
            output[k] = part1[i];
            k++;
            i++;
        }
        while(j < part2.length){
            output[k] = part2[j];
            k++;
            j++;
        }
    }
    public static void main(String[] args) {
       int arr[] = {1,2,4,5,7,8,4,5,4,5,7,6,2,3};
       mergeSort(arr);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       } 
    }
}
