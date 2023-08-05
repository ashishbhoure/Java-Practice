/* input: "ashhb"
 * output: "ash*hb"
 */

package Recursion;

public class AddStar {
    public static String addStar(String str){
        if(str.length() <= 1){
            return str;
        }
        String out = addStar(str.substring(1));
        if(str.charAt(0) == str.charAt(1)){
            out= str.charAt(0) + "*" + str.charAt(1) + out.substring(1);
        }else{
            out = str.charAt(0) + out;
        }
        return out;
    }
    public static void main(String args[]){
        String str = "ashhi";
        System.out.println(addStar(str));
    }
}
