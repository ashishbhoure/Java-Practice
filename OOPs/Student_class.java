package OOPs;

import java.util.Scanner;

 // asseccc modifier
    // (1) default = 
    // (2) private = not be acess out the class, no one can modifie or cahnge 
    // (3) pbulic = can be acess out of the class.
    // (4) protected

public class Student_class {
    public String name;
    private int rollNo;

    public Student_class(String n, int rn){
        name = n;
        rollNo = rn;
    }

    public void setRollNo(int rn){
        if(rn <= 0){
            return ;
        }
        rollNo = rn;
    }

    public int getRollNo(){
        return rollNo;
    }
    
    public void print(){
        System.out.println(name +" : "+rollNo);
    }

}
