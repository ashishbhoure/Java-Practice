package AVL;

// import java.util.Scanner;

class AVL{
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
    
    public AVL() {
        
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
        return rotate(node);
    }

    // AVL tree rotate method

    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            // left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                // left left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                // left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        
        
        if(height(node.left) - height(node.right) < -1){
            // right heavy
            if(height(node.left.left) - height(node.left.right) < 0){
                // right right case
                return leftRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                // right left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        
        return node;
    }

    // right rotate
    private Node rightRotate(Node p){  // p-> parent  c->child  g->grandchild
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left) , height(p.right) +1);
        p.height = Math.max(height(c.left) , height(c.right) +1);
        
        return c;
        
    }
    
    // left Rotate;
    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;
        
        c.left = c;
        p.right = t;
        
        p.height = Math.max(height(p.left) , height(p.right) +1);
        p.height = Math.max(height(c.left) , height(c.right) +1);

        return p;
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
        AVL avlTree = new AVL();
         for(int i=0;i<1000;i++){
            avlTree.insert(i);
         }

        //  System.out.println(avlTree.height());
    }
   
}