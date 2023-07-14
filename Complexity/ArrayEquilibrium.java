/*
 *  [2,1,5,2,1] ==  equilibrium was when when the sum of the lest and right element is same.
 *  is : 5 ---> left=3 , right=3 , mid is 5.
 */

package Complexity;

public class ArrayEquilibrium {
    public static int equillibrium(int[] arr){
        int rightSum =0;
        int leftSum =0;

        for(int i=0;i<arr.length;i++){
            rightSum += arr[i];
        }
        for(int i=0;i<arr.length;i++){
            rightSum -= arr[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;

    }

    // this code is for optimal equillibrium solution 
    public static int optimalEquillibriumCode(int[] arr){
        int totalSum =0;
        for(int i=0;i<arr.length;i++){
            totalSum +=arr[i];
        }
        
        int leftSum =0;
        for(int i=0;i<arr.length;i++){
            int rightSum = totalSum -leftSum -arr[i];
            if(leftSum == rightSum){
                return arr[i];
            }
            leftSum = leftSum + arr[i];
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] arr = {1,3,2,1,3};
        // System.out.println(equillibrium(arr));
        System.out.println(optimalEquillibriumCode(arr));
    }
}
