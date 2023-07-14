package Recursion;

public class PrintNum {
    public static void printNum(int n){
        if(n == 0){
            return;
        }
        printNum(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 5;
        printNum(n);
    }
}
