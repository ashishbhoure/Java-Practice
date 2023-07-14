package Recursion;

public class Power {
    public static int power(int x, int n){
        if(x == 0 && n ==0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        int smallAns = power(x, n/2);
        if(n%2 == 0){
            return smallAns * smallAns;
        }else{
            return x * smallAns * smallAns;
        }
    }
    public static void main(String[] args) {
        int x = 5;
        int n = 2;
        System.out.println(n+"power of "+x+" is : "+power(x,n));
    }
}
