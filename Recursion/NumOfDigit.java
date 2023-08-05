package Recursion;

public class NumOfDigit {
    public static int count(int n){
        if(n == 0){
            return 0;
        }
        int small = count(n/10);
        return small + 1 ;
    }
    public static void main(String[] args) {
        int n = 40256;
        System.out.println("number count is : "+count(n));
    }
}
