/* 
 * xyz // substring
 * x,xy,xyz
 * y,yz,z
 */

package String;

public class AllSubstring {
    public static void printSubstring(String str){
        for(int i =0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
    public static void main(String[] args) {
        String str = "Ashish";
        printSubstring(str);
    }
}
