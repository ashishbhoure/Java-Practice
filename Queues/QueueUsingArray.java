package Queues;

public class QueueUsingArray {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(){
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }
   
    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

      int size(){
        return size;
      }

    boolean isEmpty(){
        return (size == 0);
    }

    int front(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return data[front];
    }

    void enqueue(int elem){
        if(size == data.length){
            // System.out.println("Queue is overflow (QueueFullException)");
            // return;
            doubleCapacity();
        }
        if(size==0){
            front++;
        }
        size++;
        
        // rear++;
        // if(rear == data.length){
        //     rear = 0;
        // }

        rear = (rear +1) %data.length;

        data[rear] = elem;

    }

    private void doubleCapacity(){
        int temp[] = data;
        data = new int[2 * temp.length];
        int index=0;
        for(int i=front; i<temp.length;i++){
            data[index] = temp[i];
            index++;
        }
        for(int i=0;i<=front-1;i++){
            data[index] = temp[i];
            index++;
        }
        front = 0;
        rear = temp.length - 1;
    }

    int dequeue(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = data[front];
        // front++;
        // if(front == data.length){
        //     front = 0;
        // }
        front = (front + 1 )% data.length;
        size--;
        if(size == 0){
            front = -1;
             rear = -1;
        }
        return temp;
    }
}
