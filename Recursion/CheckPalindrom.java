/* Problem Description:​ ​Check if a given String S is palindrome or not (usingrecursion). Return true or false */

package Recursion;

public class CheckPalindrom {
    public static boolean checkPalindrom(String str){
        if(str.length() <= 1){
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return checkPalindrom(str.substring(1,str.length() -1));
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(checkPalindrom(str));
    }
}
