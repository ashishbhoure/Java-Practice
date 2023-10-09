package Queues;

public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;

    int size;

    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }

    T front(){
        if(size == 0){
            System.out.println("Queue is Empty");
        }
        return front.data;
    }

    void enqueue(T value){
        Node<T> newNode = new Node<>(value);
        if(rear == null){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;

        }
        size++;
    }

    T dequeue(){
         if(size == 0){
            System.out.println("Queue is Empty");
        }

        T temp = front.data;
        front = front.next;
        if(size == 1){
            rear = null;
        }
        size--;

        return temp;
    }




}
