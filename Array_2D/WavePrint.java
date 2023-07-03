package Array_2D;

public class WavePrint {
    public static void wavePrint(int arr[][]){
        int nRow = arr.length;
        if(nRow == 0){
            return;
        }
        int mCol = arr[0].length;
        for(int j=0;j<mCol;j++){
            if(j%2==0){
                for(int i =0;i<nRow;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int i=nRow-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        wavePrint(arr);
    }
}
