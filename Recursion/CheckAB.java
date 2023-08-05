/* Suppose you have a string, S, made up of only 'a's and 'b's. 
Write a recursive function that checks if the string was generated using the following rules:
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false. 
    "abb" : true
    "abab" : false
*/

package Recursion;

public class CheckAB {
    public static boolean checkAB(String str){
        if(str.length() == 0){
            return true;
        }
        if(str.charAt(0) == 'a'){
            if(str.substring(1).length() >1 && str.substring(1, 3).equals("bb")){
                return checkAB(str.substring(3));
            }else{
                return checkAB(str.substring(1));
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "abbab";
        System.out.println(checkAB(str));
    }
}
