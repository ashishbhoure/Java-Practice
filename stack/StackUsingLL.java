package stack;

public class StackUsingLL<T> {
    
    private Node<T> head;
    private int size;

    public StackUsingLL(){
        head = null;
        size =0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return (size == 0); // head == null
    }

    T top(){
        if(size() == 0){
            System.out.println("Stack is Empty");
        }
        return head.data;
    }

    void push(T elem){
        Node<T> newNode = new Node<T>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }

    T pop(){
        if(size() == 0){
            System.out.println("Stack is Empty");
        }
        T tempdata = head.data;
        head = head.next;
        size--;
        return tempdata;
    }



}
