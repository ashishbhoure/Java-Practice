/* A child is running up a staircase with N steps, 
and can hop either 1 step, 2 steps or 3 steps at a time. 
Implement a method to count how many possible ways the child can run up to the stairs. 
You need to return number of possible ways W. */

package Recursion;

public class StairCase {
    public static int stairCase(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return stairCase(n-1) + stairCase(n-2) + stairCase(n-3);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(stairCase(n));
    }
}
