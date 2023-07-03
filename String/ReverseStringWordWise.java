// Reverse string word wise
package String;

public class ReverseStringWordWise {

    public static String reverseStrWordWise(String str){
        String result = "";
        int end = str.length();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) == ' '){
                result += str.substring(i+1,end)+" ";
                end = i;
            }
        }
        result += str.substring(0, end);
        return result;
    }
    public static void main(String[] args) {
        String str = "Hello i am ashish";
        String reverse = reverseStrWordWise(str);
        System.out.println(reverse);
    }
}
