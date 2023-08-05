/* find all the index where the give no. n find into the array*/

package Recursion;

public class AllIndexesOfNum {
    public static int[] allIndexes(int arr[],int n){
        return allIndexes(arr,n,0);
    }
    private static int[] allIndexes(int arr[],int n,int startIndex){
        if(startIndex == arr.length){
            int output[] = new int[0];
            return output;
        }
        int smalloutput[] = allIndexes(arr, n, startIndex +1);
        if(arr[startIndex] == n){
            int output[] = new int[smalloutput.length +1];
            output[0] = startIndex;
            for(int i =0;i<smalloutput.length;i++){
                output[i+1] = smalloutput[i];
            }
            return output;
        }else{
            return smalloutput;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,2,6};
        int n = 2;
        int output[] = allIndexes(arr, n);
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+ " ");
        }   
    }
}
