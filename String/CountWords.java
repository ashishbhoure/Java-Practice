package String;

import java.util.Scanner;

public class CountWords {
    public static int countWords(String str){
        int wordCount =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                wordCount++;
            }
        }
        wordCount++;
        return wordCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Word count is : "+ countWords(str));
    }
}