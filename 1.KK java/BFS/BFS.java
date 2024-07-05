package BFS;
import utils.*;

public class BFS {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();

            if(root == null){
                return result;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty()){
                int levelSize = queue.size();
                List<Integer> curentLevel = new ArrayList<>(levelSize);
                for(int i =0;i<levelSize;i++){
                    TreeNode currNode = queue.poll();
                    curentLevel.add(currNode.val);
                    if(curentLevel.left != null){
                        queue.offer(currNode.left);
                    }
                    if(curentLevel.right != null){
                        queue.offer(currNode.right);
                    }
                }
                result.add(curentLevel);
            }

            return result;

        }



        
}
