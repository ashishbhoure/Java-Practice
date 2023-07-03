package String;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() -1 ;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a palindorme string : ");
        String str = sc.next();
        if(isPalindrome(str)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is NOT palindrome");
        }
    }
}
