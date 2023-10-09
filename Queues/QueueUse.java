package Queues;

public class QueueUse {
    public static void main(String[] args) {
        // // Queue using array 
        // QueueUsingArray queue = new QueueUsingArray(3);

        // Queue using linked list 
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        
        for(int i=1;i<=5;i++){
            queue.enqueue(i);
        }

        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
