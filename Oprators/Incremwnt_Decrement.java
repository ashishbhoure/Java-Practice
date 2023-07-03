package Oprators;

public class Incremwnt_Decrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);
        a++;
        ++a;
        System.out.println(a);

        int b = a++;
        System.out.println(b);
        System.out.println(a);


        a=4;
        a*= 2;
        System.out.println(a);
        a^=2;
        System.out.println(a);

        // int ans = 2*3/2; 
        int ans = (2*3)/2; // right way to use brakets
        System.out.println(ans);

        // int x = 10;
        // int y = 20;
        // if(x++>10 && ++y>20){
        //     System.out.println(x +" "+y);
        // }else{
        //     System.out.println(x +" "+y);

        // }
    }
}
