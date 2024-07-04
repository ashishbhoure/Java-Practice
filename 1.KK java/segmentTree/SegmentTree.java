package segmentTree;

public class SegmentTree {  

    private class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval , int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr){
        // create a tree using arr
        this.root = contructTree(arr,0,arr.length-1);
    }

    private Node contructTree(int[] arr,int start, int end){
        if(start == end){
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start,end);

        int mid = (start + end)/2;

        node.left = this.contructTree(arr,start ,mid);
        node.right = this.contructTree(arr, mid+1, end);
        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        String str = "";

        if(node.left != null){
            str = str + "Interval=["+ node.left.startInterval + " - "+ node.left.endInterval +"] and data "  + node.left.data + " =>";
        }else{
            str = str + "no left child";
        }
        
        // for cureent node
        str = str + "Interval=["+ node.startInterval + " - "+ node.endInterval +"] and data "  + node.data + " <=";

        if(node.right != null){
            str = str + "Interval=["+ node.right.startInterval + " - "+ node.right.endInterval +"] and data "  + node.right.data ;
        }else{
            str = str + "no right child";
        }

        System.out.println(str +'\n');

        if(node.left != null){
            display(node.left);
        }
        if(node.right != null){
            display(node.right);
        }
    }

    // query 
    public int query(int qsi , int qei){
        return this.query(this.root,qsi, qei);
    }

    private int query(Node node,int qsi,int qei){
        if(node.startInterval >= qsi && node.endInterval <= qei){
            // node completly lying inside the query
            return node.data;
        }else if(node.startInterval > qei || node.endInterval < qsi){
            // completely outside
            return 0;
        }else{
            return this.query(node.left,qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    // update
    public void update(int index , int value){
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node,int index,int value){
         if(index >= node.startInterval && index <= node.endInterval){
            if(index == node.startInterval && index == node.endInterval){
                node.data = value;
                return node.data;
            }else{
                int leftAns = update(node.left , index, value);
                int rightAns = update(node.right , index, value);

                node.data = leftAns + rightAns;
                return node.data;
            }
         }
         return node.data;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,7,6,-2,-8,4,9};

        SegmentTree tree = new SegmentTree(arr);
        // tree.display();

        System.out.println(tree.query(1, 6));
    }

}
