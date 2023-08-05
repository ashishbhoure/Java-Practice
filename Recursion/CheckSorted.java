package Recursion;

public class CheckSorted {
    // public static boolean checkSorted(int[] arr){
    //     if(arr.length <= 1){
    //         return true;
    //     }

    //     int smallarr[] = new int[arr.length -1];

    //     for(int i=1;i<arr.length;i++){
    //         smallarr[i-1] = arr[i];
    //     }

    //     boolean smallans = checkSorted(smallarr);
    //     if(!smallans){
    //         return false;
    //     }
    //     if(arr[0]<= arr[1]){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }

     public static boolean checkSorted_2(int[] arr){
        if(arr.length <= 1){
            return true;
        }
        if(arr[0] > arr[1]){
            return false;
        }

        int smallarr[] = new int[arr.length -1];

        for(int i=1;i<arr.length;i++){
            smallarr[i-1] = arr[i];
        }

        boolean smallans = checkSorted_2(smallarr);
        return smallans;

    }

    // this function checks if the array is sorted from startindex to end
    private static boolean checkSortedBetter(int arr[], int startIndex){
        if(startIndex >= arr.length -1){
            return true;
        }
        if(arr[startIndex] > arr[startIndex +1 ]){
            return false;
        }
        boolean smallans = checkSortedBetter(arr, startIndex +1);
        return smallans;
    }
    public static boolean checkSortedBetter(int arr[]){
        return checkSortedBetter(arr,0);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        // System.out.println(checkSorted(arr));
        System.out.println(checkSorted_2(arr));
        System.out.println(checkSortedBetter(arr));
    }
}
