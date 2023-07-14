/* Srink the consicutivve letter in a string 
 * aaaabbcdd  -> a4b2cd2
 */
package Array_2D;

public class SrinkTheString {
    public static String getCompressedStr(String str){
        int n = str.length();
        String ans = "";

        if(n == 0){
            return ans;
        }
        int currentCharCount = 1;
        ans += str.charAt(0);

        for(int i=1;i<n;i++){
            if(str.charAt(i) == str.charAt( i-1)){
                currentCharCount++;
            }else{
                if(currentCharCount >1){
                    ans += currentCharCount;
                    currentCharCount = 1;
                }
                ans+= str.charAt(i);
            }
        }
        if(currentCharCount >1){
            ans += currentCharCount;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "aaabbsbbddddd";
        System.out.println("Compressed str is : "+getCompressedStr(str));
    }
}
