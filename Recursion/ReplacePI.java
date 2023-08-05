package Recursion;

public class ReplacePI {
    public static String replacePI(String str){
        String out ;
        if(str.length() <=1){
            return str;
        }
        String small = replacePI(str.substring(1));
        if(str.charAt(0) == 'p' && small.charAt(0) == 'i'){
            out = "3.14"+ str.substring(1);
        }else{
            out = str.charAt(0) + small;
        }
        return out;
    }
    public static void main(String[] args) {
        String str = "apispbi";
        System.out.println(replacePI(str));
    }
}
