package String;

public class String_basic {

    public static void print(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }

    public static void printPrefix(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(i + " " +str.substring(0, i+1));
        } 
    }
    public static void main(String[] args) {
        // char c='A';

        String str = "Ashish";
        // print(str);

        printPrefix(str);

        // int[] arr1 = {1,2,3};
        // // int[] arr2 = {1,2,3}; 
        // int[] arr2 = arr1;
        // if(arr1 == arr2){
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Unequal");
        // }
        // System.out.println(arr1);
        // System.out.println(arr2);

        // System.out.println(str.charAt(2));
        // System.out.println(str.length());
        // System.out.println(str.substring(2,5)); //begainIndex , endIndex (n-1)
        // System.out.println(str.substring(1));  // 1- end
        // System.out.println(str.substring(str.length()));   // enpty string
        // // System.out.println(str.substring(str.length()+1)); // Error StringIndexOutOfBoundsExecption      
        // System.out.println(str.substring(1,1)); // empty string
        // System.out.println(str.contains("Ash")); // true
        // System.out.println(str.contains("hs"));  //false
        
        // str = "abc";
        // str = str + "def";
        // System.out.println(str);
        // System.out.println(str.concat("ghi"));

        // String str1 ="abc";
        // String str2 ="abc";
        // if(str1 == str2){
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Un Equal"); 
        // }

    }
}
