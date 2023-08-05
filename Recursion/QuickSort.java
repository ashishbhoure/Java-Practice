package Recursion;

public class QuickSort {
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[si];
        int count = 0;
        for(int i = si+1;i<=ei;i++){
            if(arr[i]<= pivot){
                count++;
            }
        }
        int pivotIndex = si+count;
        arr[si] = arr[pivotIndex];
        arr[pivotIndex] = pivot;

        int i=si , j=ei;
        while(i<j){
            while(i<=ei && arr[i]<=pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }
            if(i<=j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int partitionIndex = partition(arr, si, ei);
        quickSort(arr, si, partitionIndex-1);
        quickSort(arr, partitionIndex+1, ei);
    }
    public static void quickSort(int arr[]){
        quickSort(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {5,1,2,4,5,2,1,6,7,5,9};
        quickSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }   
}
