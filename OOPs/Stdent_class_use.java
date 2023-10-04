package OOPs;

import java.util.Scanner;

public class Stdent_class_use {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            Student_class s1 = new Student_class("ashi",101);
            s1.print();
            
            
            Student_class s2 = new Student_class("ashu",102);
            s2.print();
            // System.out.println(s2.name);
            // System.out.println(s2.getRollNo());
    }
}

