package Recursion;

public class ConvertStringToInteger {
    public static int convertStringToInteger(String str){
        if(str.length() == 1){
            return str.charAt(0) - '0';
        }
        int smallOut = convertStringToInteger(str.substring(0, str.length()-1));
        int lastDigit = str.charAt(str.length()-1) -'0';
        return smallOut*10 + lastDigit;
    }
    public static void main(String[] args) {
        String str = "1234";
        System.out.println(convertStringToInteger(str));
    }
}
