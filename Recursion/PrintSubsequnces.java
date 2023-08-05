/* "xyz"
 *  z
    y
    yz
    x
    xz
    xy
    xyz
*/
package Recursion;

public class PrintSubsequnces {
    public static void printSubsequnces(String input , String output){
        if(input.length() == 0){
            System.out.println(output);
            return;
        }
        // we choose not to include 1st char
         printSubsequnces(input.substring(1),output);
        //  we choose to include 1st char.
         printSubsequnces(input.substring(1),output + input.charAt(0));
    }
    public static void printSubsequnces(String str){
        printSubsequnces(str," ");
    }
    public static void main(String[] args) {
        printSubsequnces("xyz");
    }
}
