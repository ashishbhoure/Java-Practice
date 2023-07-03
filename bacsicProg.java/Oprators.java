public class Oprators {
    public static void main(String[] args) {
        int a = 4;
        // int b = 6 - a; // arthmetic oprator
        int b = 6 % a; // Modulo oprator
        b += 2;
        System.out.println(b);

        //Relational oprators 
        // >=,<=,>,<,==,!= it gives true or false as ouput 
        System.out.println(a>b); 
        
        // System.out.println(5 == 7); // comparition oprator

        System.out.println(25>2 && 25>8); //logical oprator (both will be true)
        System.out.println(25>2 || 25>28); //logical oprator (one will be true)
    }
}    