package Array_2D;

public class LargestRowNCol {
    public static void findLargest(int arr[][]){
        boolean isRow = true;
        int largestSum = Integer.MIN_VALUE;
        int num = 0;

        int nRows = arr.length;
        if(nRows == 0){
            System.out.println("row "+num+" "+largestSum);
            return;
        }
        int mCol = arr[0].length;
        for(int i =0;i<nRows;i++){
            int rowSum = 0;
            for(int j =0;j<mCol;j++){
                rowSum += arr[i][j];
            }
            if(rowSum >largestSum){
                largestSum = rowSum;
                num = i;
            }
        }
        for(int j=0;j<mCol;j++){
            int colSum = 0;
            for(int i=0;i<nRows;i++){
                colSum += arr[i][j];
            }
            if(colSum > largestSum){
                largestSum = colSum;
                num = j;
                isRow = false;
            }
        }
        if(isRow){
            System.out.println("row "+num+" "+largestSum);
        }else{
            System.out.println("column "+num+" "+largestSum);
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{2,0,1},{2,2,6}};
        findLargest(arr);
    }
}
