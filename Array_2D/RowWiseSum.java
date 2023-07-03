package Array_2D;

public class RowWiseSum {
    public static void rowWiseSum(int[][] arr){
        int nRow = arr.length;
        if(nRow == 0){
            return;
        }
        int nCol = arr[0].length;
        for(int i=0;i<nRow;  i++){
            int rowSum = 0;
            for(int j=0;j<nCol;j++){
                rowSum += arr[i][j];
            }
            System.out.println(rowSum + " ");
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{3,2,4}};
        rowWiseSum(arr);
    }
}
