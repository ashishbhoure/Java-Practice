package Recursion;

public class Keypad {
    public static String[] singleDigit(int n){
        if(n<=1 || n>10){
            System.exit(0);
        }

        if(n==2){
            String output[] = {"a","b","c"};
            return output;
        }
        else if(n==3){
            String output[] = {"d","e","f"};
            return output;
        }
        else if(n==4){
            String output[] = {"f","h","i"};
            return output;
        }
        else if(n==5){
            String output[] = {"j","k","l"};
            return output;
        }
        else if(n==6){
            String output[] = {"m","n","o"};
            return output;
        }
        else if(n==7){
            String output[] = {"p","q","r","s"};
            return output;
        }
        else if(n==8){
            String output[] = {"t","u","v"};
            return output;
        }
        else{
            String output[] = {"W","x","y","z"};
            return output;
        }
    }

    public static String[] keypad(int n){
        if(n==0){
            String output[] ={" "};
            return output;
        }
        String smallNumArray[] = keypad(n/10);
        String singleDigitOut[] = singleDigit(n%10);
        String output[] = new String[singleDigitOut.length * smallNumArray.length];
        int k = 0;
        for(int a=0;a<singleDigitOut.length;a++){
            for(int i=0;i<smallNumArray.length;i++){
                output[k] = smallNumArray[i] + singleDigitOut[a];
                k++; 
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int n = 23;
        String[] out = keypad(n);
        for(int i=0;i<out.length;i++){
            System.out.print(out[i]);
        }
    }
}
