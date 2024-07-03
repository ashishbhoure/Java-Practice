
    // preOrder traversal
    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.value +" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    
    
    // InOrder traversal
    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value +" ");
        inOrder(node.right);
    }
    
    
    // postOrder traversal
    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value +" ");
    }
