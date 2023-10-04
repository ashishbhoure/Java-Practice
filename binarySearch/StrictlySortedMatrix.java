package binarySearch;

import java.util.Arrays;

// Strictly Soted matrix 

public class StrictlySortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        System.out.println(Arrays.toString(search(arr, 2))); // error is comimg on searching of '4' (TODO)
    }

    // search in tha row provided between the col provided
    static int[] binarySearch(int[][] arr,int row,int cStart,int cEnd , int target){
        while(cStart < cEnd){
            int mid = cStart + (cEnd-cStart) / 2;
            if(arr[row][mid] == target){
                return new int[]{row,mid};
            }
            if(arr[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid-1;
            }

        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] arr, int target){

        int row=arr.length;
        int col = arr[0].length;

        if(row ==1){
            return binarySearch(arr, 0, 0, col-1, target);
        }

        // run the loop till 2 rows r remaining

        int rStart = 0;
        int rEnd = row-1;
        int cMid = col/2;

        while(rStart < (rEnd - 1)){
            int mid = rStart +(rEnd - rStart) /2;
            if(arr[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(arr[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }

        }

        // now we hve 2 rows
        if(arr[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(arr[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }

        // 1st half
        if(target <= arr[rStart][cMid - 1]){
            return binarySearch(arr, rStart,0, cMid -1, target);
        }
        // 2nd half
        if(target >= arr[rStart][cMid + 1] && target <= arr[rStart][col-1]){
            return binarySearch(arr, rStart,cMid+1, col -1, target);
            
        }
        // 3rd half
        if(target <= arr[rStart + 1][cMid - 1]){
            return binarySearch(arr, rStart +1 ,0, cMid -1, target);
            
        }else{ 
            return binarySearch(arr, rStart +1,cMid+1, col-1, target);
            
        }        

    }
}
