package scope;

public class Scope1 {
    public static void main(String[] args) {
        int i = 10;                 // 1st initialize then use
        System.out.println(i);
        // int i=20;                   // re-initi is not allowed Error re-duplicate
        if(i==10){
            // int i = 5;   // same variable name is note allowed;
            int n = 12;       // local variable           
            System.out.println(n);
        }
        // System.out.println(n);   // not acess outside '{}', (local value)
        
        int n = 41; 
        System.out.println(n);


        
    }
}
