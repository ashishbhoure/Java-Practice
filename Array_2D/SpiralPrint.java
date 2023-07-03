package Array_2D;

public class SpiralPrint {
    public static void spiralPrint(int[][] arr){
        int nRows = arr.length;
        if(nRows == 0){
            return;
        }
        int mCols = arr[0].length;
        int i, rowStart = 0, colStart =0;
        int numElements = nRows * mCols , count = 0;

        while(count < numElements){
            for(i = colStart ; count <numElements &&  i<mCols;++i){
                System.out.println(arr[rowStart][i] + " ");
                count++;
            }
            rowStart++;
            for(i = rowStart;count<numElements && i<nRows;++i){
                System.out.println(arr[i][mCols-1]+" ");
                count++;
            }
            mCols--;
            for(i=mCols-1;count<numElements && i>=colStart;--i){
                System.out.println(arr[nRows-1][i]+" ");
                count++;
            }
            nRows--;
            for(i=nRows-1;count<numElements && i>=rowStart;--i){
                System.out.println(arr[i][colStart]+" ");
                count++;
            }
            colStart++;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralPrint(arr);
    }
}
