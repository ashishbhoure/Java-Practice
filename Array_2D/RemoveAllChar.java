/* Remove all occurance char..
 * ashu -> remove s :: ahu;
 */
package Array_2D;

public class RemoveAllChar {
    public static String removeAllChar(String str, char ch){
        int n = str.length();
        String ans ="";
        for(int i=0;i<n;i++){
            if(str.charAt(i) != ch){
                ans += str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "ashish";
        char ch = 's';
        System.out.println("After removing char. string is : "+removeAllChar(str, ch));
    }
}
