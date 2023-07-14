/* Problem Description:​ ​Given a string S, reverse each word of a string individually.
For eg. if a string is "abc def", reversed string should be "cba fed */

package Array_2D;

public class ReverseEachWord {
    public static String reverseWord(String str , int start, int end){
        String reverse ="";
        while(start < end){
            reverse = str.charAt(start) + reverse;
            ++start;
        }
        return reverse;
    }
    public static String reverseEachWord(String str){
        int n = str.length();
        int previousSpaceIndex = -1;
        String ans = "";
        int i=0;
        for(;i<n;i++){
            if(str.charAt(i)==' '){
                ans+= (reverseWord(str,previousSpaceIndex+1,i)+" ");
                previousSpaceIndex = i;
            }
        }
        ans += (reverseWord(str,previousSpaceIndex+1,i)+" ");
        return ans;
    }   
    public static void main(String[] args) {
        String str = "hi ashish !";
        System.out.println("reverse is : "+reverseEachWord(str));
    }
}
