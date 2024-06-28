package BST;

// import java.util.Scanner;

class BST{
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
    
        public Node (int value){
            this.value = value;
        }
    
        public int getValue(){
            return value;
        }
    }
    
    public Node root;
    
    public BST() {
        
    }
    
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }
    
    // insert a node into BST
    public void insert(int value){
        root = insert(value,root);
    }

    private Node insert(int value , Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height= Math.max(height(node.left) , height(node.right)) +1;
        return node;
    }

    // insert multiple at a time 
    public void populate(int[] nums){
        for(int i=0 ; i<nums.length;i++){
            this.insert(nums[i]);
        }
    }


    // for sorted tree
    public void populateSorted(int[] nums){
        populateSorted(nums, 0,nums.length);
    }

    private void populateSorted(int[] nums ,int  start,int end){
        if(start >= end){
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populateSorted(nums , start , mid);
        populateSorted(nums , mid +1  , end);
    }

// check for a tree is balanced or node 
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right) ) <= 1 && balanced(node.left) && balanced(node.right);
    }

    // display the BST 

    public void display(){
        display(root,"");
    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.getValue());


        display(node.left,"left child of "+node.getValue()+" : ");
        display(node.right,"right child of "+node.getValue()+" : ");
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        BST bstree = new BST();
        int[] nums = {15,10,20,5,12};
        bstree.populate(nums);
        // int[] sortedNums = {1,2,3,4,5};
        // bstree.populateSorted(sortedNums);
        bstree.display();
        System.out.println("is tree balanced : "+bstree.balanced());;
    }
   
}