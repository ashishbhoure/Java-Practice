/* Problem Description: ​You are given with an array of integers of size n which contains
 numbersfrom 0 to n - 2. Each number is present at least once. 
 That is, if n = 5, numbers from 0 to 3 ispresent in the given array at least once and 
 one number is present twice. You need to find andreturn that duplicate number present in the
  array 
*/

package Complexity;

public class FindDublicate {

    public static int firndDublicate(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        int n = arr.length;
        int sumOfNatunalNo = ((n-1)*(n-2))/2;

        return sum-sumOfNatunalNo;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,0,3,4};
        System.out.println("the duplicate no is : "+firndDublicate(arr));
    }
}
