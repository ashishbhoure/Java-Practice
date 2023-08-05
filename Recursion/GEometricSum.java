/* Geometric Sum
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
using recursion. */

package Recursion;

public class GEometricSum {
    public static double geometricSum(int k){
        if( k== 0){
            return 1;
        }

        return geometricSum(k-1) + 1/Math.pow(2,k);
    }
    public static void main(String[] args) {
        int k =5;
        System.out.println(geometricSum(k));
    }
}
