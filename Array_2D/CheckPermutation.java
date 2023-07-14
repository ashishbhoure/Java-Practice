/* Problem Description:​ ​Given two strings, check if they are permutations of eachother. 
Return true or false */

package Array_2D;

public class CheckPermutation{
    public static boolean checkPermutaion(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        boolean isPermutation = true;
        int[] frequency = new int[256];
        for(int i=0;i<256;++i){
            frequency[i]=0;
        }
        for(int i=0;i<str1.length();++i){
            char ch = str1.charAt(i);
            ++frequency[ch];
        }
        for(int i=0;i<str2.length();++i){
            char ch = str2.charAt(i);
            --frequency[ch];
        }
        for(int i=0;i<256;++i){
            if(frequency[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "acdb";
        System.out.println("the permutation string chesk is : "+ checkPermutaion(str1, str2));
    }
}