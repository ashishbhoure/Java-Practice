package searching_sorting;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1 ,2,5,4,1,6,2,8};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
