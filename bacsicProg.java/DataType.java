public class DataType {
    public static void main(String[] args) {
        char c ='a';
        System.out.println(c + 3);

        int i = c+10;
        System.out.println(i);

        char ab = (char) i; // type casting manual typecasting higer to lower
        System.out.println(ab);

        double d = 1.233;
        float f = 1.23f;
        // f =d // can store double into float {higer datatype into lower}
        f = (float) d;
        d = f ;


    }
}
