package searching_sorting;

public class MergeTwoArr {

    public static int[] mergeTwoArr(int[] arr1, int[] arr2){
        int[] mergeArr = new int[arr1.length + arr2.length];

        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                mergeArr[k] = arr1[i];
                k++;
                i++;
            }else{
                mergeArr[k] = arr2[j];
                k++;
                j++;
            }
        }

        while(i<arr1.length){
            mergeArr[k] = arr1[i];
            k++;
            i++;
        }
        
        while(j<arr2.length){
            mergeArr[k] = arr2[j];
            k++;
            j++;
        }

        return mergeArr;
    }
    public static void main(String[] args) {
        // both array should be in sorted order 
        int[] arr1 = {1,2,5,6,7};
        int[] arr2 = {2,4,8,9};

        int[] mergeArr = mergeTwoArr(arr1, arr2);
        for(int i=0;i<mergeArr.length;i++){
            System.out.print(mergeArr[i] + " ");
        }

    }
}
