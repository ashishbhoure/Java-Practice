
package stack;

public class StackUsingArray {

    private int[] data ;
    private int top; // it is the index of topmoest elemnt of the stack

    public StackUsingArray(){
        data = new int[10];
        top= -1;
    }
    
    public StackUsingArray(int size){
        data = new int[size];
        top= -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public int size(){
        return top+1;
    }

    public int top(){
        if(size() == 0){
            // StackEmptyException
            System.out.println("Stack empty exception");
            // break;
            return -1;
        }
        return data[top];
    }

    public void push(int elem){
        if(size() == data.length){
            // System.out.println("Stack is full");
            // return;

            // for dynamic stack 
            doubleCapcity();
        }
        top++;
        data[top] = elem; 
    }

    private void doubleCapcity(){
        int temp[] = data;
        data = new int[2 * temp.length];
        for(int i =0;i<= top;i++){
            data[i] = temp[i];
        }
    }

    public int pop(){
        if(size() == 0){
            System.out.println("Stack is empty");
            // break;
            return -1;
        }

        int temp = data[top];
        top--;
        return temp;
    }

}
