/*
 * Remove Consicutive Duplicate
 * aabbccccddd
 * -> abcd
 */
package Array_2D;

public class RemoveConsicutiveDuplicate {
    public static String removeConsicutiveDuplicate(String str){
        int n = str.length();
        if(n == 0){
            return str;
        }
        String ans = "";
        int startIndex = 0;
        while(startIndex < n){
            char unique = str.charAt(startIndex);
            int nextUniqueIndex = startIndex + 1;

            while(nextUniqueIndex < n && str.charAt(nextUniqueIndex)== unique){
                nextUniqueIndex +=1;
            }
            ans += unique;
            startIndex = nextUniqueIndex;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aabbccdddaa";
        System.out.println("after removing : "+removeConsicutiveDuplicate(str));
    }
}
