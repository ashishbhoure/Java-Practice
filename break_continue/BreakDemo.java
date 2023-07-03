package break_continue;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the value of N : ");
        int n = s.nextInt();
        int d=2;
        boolean divided = false;
        while(d<n){
            if(n%d==0){
                divided = true;
                break;
            }
            d++;
        }
        if(divided){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}
