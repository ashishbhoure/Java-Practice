package Functions;

import java.util.Scanner;

public class NCR {
    public static int factorial(int n){
        int ans = 1;
        for(int i =1;i<=n;i++){
            ans = ans * i;
        }
        return ans;
    }

    public static boolean isPrime(int n ){
        for(int d =2;d<n;d++){
            if(d%2==0){
                return false;
            }
        }
        return true;
    }

    public static void PrintTillN(int n) {
        if(n<=0){
            return;
        }
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }

    public static int ncr(int n, int r){
        int num = factorial(n);
        int den1 = factorial(r);
        int den2 = factorial(n-r);
        int ans = num/(den1 * den2);
        return ans;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n and r : ");
        int n = s.nextInt();
        int r = s.nextInt();
        
        int output = ncr(n,r);
        System.out.println("fatorial is : " + output);
        
        boolean prime = isPrime(18);
        System.out.println(prime);
    }
}
