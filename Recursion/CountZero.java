/* Count Zeros
Given an integer N, count and return the number of zeros that are present in the given integer using recursion. */

package Recursion;

public class CountZero {
    public static int countZero(int n){
        if(n<10){
            if(n == 0){
                return 1;
            }else{
                return 0;
            }
        }

        if(n % 10 == 0){
            return countZero(n/10)+1;
        }else{
            return countZero(n/10);
        }
    }
    public static void main(String[] args) {
        int n = 1020;                           // only for the no which is not start with 0;
        System.out.println(countZero(n));
    }
}

