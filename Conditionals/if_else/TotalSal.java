/* Problem Description: ​You have to calculate the rounded off total salary of a person by usingthe formula: totalSalary = basic + hra + da + allow – pf, where hra = 20% of basic, da = 50% ofbasic, allow = 1700, if grade = ‘A’, allow = 1500, if grade = ‘B’, allow = 1300, if grade = ‘C' orany other character, pf = 11% of basic. “basic” and the “grade” will be taken as input from theuser. */

package Conditionals.if_else;
import java.util.Scanner;

public class TotalSal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Basic salary and grade : ");
        int basic_sal = s.nextInt();
        char grade = s.next().toUpperCase().charAt(0);

        double hra = basic_sal * 20/100;
        double da = basic_sal * 50/100;
        double pf = basic_sal * 11/100;
        int allow;
        if(grade == 'A'){
            allow = 1700;
        }else if(grade == 'B'){
            allow = 1500;
        }else {
            allow = 1300;
        }

        double totalSalary = basic_sal + hra + da + allow - pf ;
        System.out.println("The Total Salary is : "+(int) Math.round(totalSalary) );
    }
}
