/* 
 * xyz // substring
 * x,y,z
 * xy,xz
 * yz
 */

package String;

public class AllSubstring2 {
    public static void printSubstring(String str){
        for(int len=1;len<=str.length();len++){
            for(int start=0;start<=str.length() - len;start++){
                int end = start + len;
                System.out.println(str.substring(start, end));
            }
        }
    }
    public static void main(String[] args) {
        String str ="ashish";
        printSubstring(str);
    }
}
