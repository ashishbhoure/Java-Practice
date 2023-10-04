package Array_List;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1.size());
        list1.add(10);
        list1.add(11);
        list1.add(15);
        System.out.println(list1.size());
        System.out.println(list1.get(2));
        
        // list1.add(index,value);
        list1.add(2,50); // it add tha value on given index and shift the remain value after that index.
        System.out.println(list1.get(2));
        System.out.println(list1.size());

        // System.out.println(list1.get(10)); //(error) :: IndexOutOfBoundsException 

        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        list1.remove(1);

        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        
    // for each loop -> goes to evry element not on index , 
    // it is only use to traversal in list no modification done by this . 
        for(int elem : list1){
            System.out.print(elem + " ");
        }
    }
}
