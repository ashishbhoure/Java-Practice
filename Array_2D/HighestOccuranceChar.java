/*
 * ​Given a string, find and return the highest occurring characterpresent in the given string.
 * If there are 2 characters in the input string with same frequency,
 *  return thecharacter which comes first.
 */

package Array_2D;

public class HighestOccuranceChar {
    public static char highestOcurringChar(String str){
        int n = str.length();
        int freq[] = new int[256];
        int maxFreq =0;
        for(int i=0;i<n;i++){
            freq[str.charAt(i)]++;
            maxFreq = Math.max(maxFreq,freq[str.charAt(i)]);
        }
        char ans = '\0';
        for(int i=0;i<n;i++){
            if(freq[str.charAt(i)]==maxFreq){
                ans = str.charAt(i);
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "ashish";
        System.out.println("higest use char is : "+highestOcurringChar(str));
    }
}
