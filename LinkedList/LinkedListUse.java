package LinkedList;

import java.util.Scanner;

public class LinkedListUse {

    public static Node<Integer> takeInput(){
        Node<Integer> head = null ,tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while(data != -1){
            Node<Integer> newNode = new Node<Integer>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                // Node<Integer> temp = head;
                // while(temp.next != null){
                //     temp = temp.next;
                // }
                // temp.next = newNode;

               tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static Node<Integer> insert(Node<Integer> head, int data, int pos){
        Node<Integer> newNode = new Node<Integer>(data);
        
        if(pos == 0){
            newNode.next = head;
            return newNode;
        }

        int i=0;
        Node<Integer> temp = head;
        while(i < pos-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }


    public static Node<Integer> delete(Node<Integer> head , int pos){
        if(pos == 0){
            head = head.next;
            return head;
        }
        int i=0;
        Node<Integer> temp = head;
        while(i < pos-1){
            temp = temp.next;
            i++;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
        return head;
    }
    
    public static void main(String[] args) {
//         Node<Integer> node1 = new Node<Integer>(10);
//         System.out.println(node1.data);
//         System.out.println(node1.next);

//         Node<Integer> node2 = new Node<Integer>(20);

// // Link 1 node woth other node
//         node1.next = node2;

//         System.out.println(node2);
//         System.out.println(node1.next);


        // Node<Integer> node1 = new Node<Integer>(10);
        // Node<Integer> node2 = new Node<Integer>(20);
        // Node<Integer> node3 = new Node<Integer>(30);

        // node1.next=node2;
        // node2.next = node3;

        // Node<Integer> head = node1; // head is refrance of node1
        // print(head);


        Node<Integer> head = takeInput(); // take inpute like " 1 2 3 4 -1(to end)"
        // head = insert(head, 80, 0);
        head = delete(head, 3);
        print(head);

    }
}
