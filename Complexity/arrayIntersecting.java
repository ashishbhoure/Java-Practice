/*
 * Time complexity : O((n*log(n)) + (m*log(m)))
 * space complexity : O(1)
 * 
 * a more optomized  solution to tis problem is possible useing HashMaps.which will take :
 * time complexity : O(n + m)
 * space complexity  : O(min(n,m))
 * 
 * when 'n ' and 'm' are sizes ap input array
 */

package Complexity;

import java.util.Arrays;

public class arrayIntersecting {
    public static void intersection(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int n = arr1.length;
        int m = arr2.length;

        int i=0,j=0;
         while(i<n && j<m){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i] +" ");
                i++;
                j++;
            }else if(arr1[i]< arr2[j]){
                i++;
            }else{
                j++;                                                                                
            }
         }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,2,1,4};
        int[] arr2 = {2,3,5,2};
        intersection(arr1, arr2);
    }
}
