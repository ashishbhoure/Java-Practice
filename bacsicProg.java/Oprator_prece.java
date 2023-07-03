public class Oprator_prece {
    public static void main(String[] args) {
        // Precedence and assosiativity
        // int a = 6*5/2+4-1;
        // int b = 6/5*2+4-1;
        // System.out.println(a);
        // System.out.println(b);

        // Quick quiz
        int x = 6 ;
        int y = 1;
        // int k = x*y/2;
        // System.out.println(k);


        int b = 4;
        int a = 2;
        int c = 3;
        // int k = b*b - 4*a*c/2*a;  // there must be perenthisis "()" for accurate ans.
        int k = (b*b - 4*a*c)/(2*a);
        System.out.println(k);
        
    }
}