package Recursion;

public class SumOfDigit {
    public static int sumOfDigit(int n){
        int sum;
        if(n<10){
            return n;
        }
        sum = (n%10) + sumOfDigit(n/10);
        return sum;
    }
    public static void main(String[] args) {
        int n=1254;
        System.out.println(sumOfDigit(n));
    }
}
