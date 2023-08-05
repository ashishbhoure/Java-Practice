/* "xyz"
 * z y yz x xz xy xyz 
 */
package Recursion;

public class Subsequence {
    public static String[] findSubsequance(String str){
        if(str.length() == 0){
            String ans[] = {" "};
            return ans;
        }

        String smallAns[] = findSubsequance(str.substring(1));
        String ans [] = new String[2 * smallAns.length];
        int k = 0;
        for(int i=0;i<smallAns.length; i++){
            ans[k] = smallAns[i];
            k++;
        }
        for(int i=0;i<smallAns.length; i++){
            // ans[i + smallAns.length];
            ans[k] = str.charAt(0) + smallAns[i];
            k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "xyz";
        String output[] = findSubsequance(str);
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]);
        }
    }
}
    