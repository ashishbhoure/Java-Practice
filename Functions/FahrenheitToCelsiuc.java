/* Problem Description: ​You are given with three values - Start Fahrenheit Value (S), 
EndFahrenheit value (E) and Step Size (W), 
you need to convert all Fahrenheit values from Start toEnd at the gap of W, 
into their corresponding Celsius values and print the tabl */

package Functions;
public class FahrenheitToCelsiuc {
    public static void fahTocel(int s,int e,int w){
        int current = s;
        while(current<= e){
            int fah_Value = (int) ((5.0/9)*(current-32));
            System.out.println(current+"\t"+fah_Value);
            current=current+w;
        }
    }
    public static void main(String[] args) {
        fahTocel(0, 100, 20);
    }
}
