package Recursion;

public class SubsetOfArray {
    public static int[][] subsets(int[] arr, int startIndex){
        if(startIndex == arr.length){
            int[][] output = new int[1][0];
            return output;
        }
        int[][] smallOutput = subsets(arr,startIndex+1);
        int[][] output = new int[2*smallOutput.length][];

        int k = 0;
        for(int i=0;i<smallOutput.length;i++){
            output[k] = new int[smallOutput[i].length];
            for(int j=0;j<smallOutput[i].length;j++){
                output[k][j] = smallOutput[i][j];
            }
            k++;
        }
        for(int i=0;i<smallOutput.length;i++){
            output[k] = new int[smallOutput[i].length+1];
            output[k][0] = arr[startIndex];
            for(int j=1;j<=smallOutput[i].length;j++){
                output[k][j] = smallOutput[i][j-1];
            }
            k++;
        }
        return output;
    }

    public static int[][] subsets(int[] arr){
        return subsets(arr,0);
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        int[][] output = subsets(arr);
        System.out.println(output);
        for(int i=0;i<output.length;i++){
            for(int j=0;j<output[i].length;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}
