/* Problem Description: ​Given an integer array of size 2N + 1. In this given array, 
N numbers arepresent twice and one number is present only once in the array. 
You need to find and return thatnumber which is unique in the array.
For example: size= 7                    
arr[] = 2 3 1 6 3 6 2
Output: 1 
*/

package Complexity;

public class FindUnique {

    public static int findUniqui(int[] arr){
        int XOR = 0;
        for(int i=0;i<arr.length;i++){
            XOR ^= arr[i];
        }
        return XOR;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,2,1,3};
        System.out.println("Uniqui no is : "+ findUniqui(arr));
    }
}
