package stack;

public class StackLLUse {
   public static void main(String[] args) {
     StackUsingLL<Integer> stack = new StackUsingLL<>();
        for(int i=1;i<=5;i++){
            stack.push(i);
        }

        while(!stack.isEmpty()){
            // try{
                System.out.println(stack.pop());
            // }catch(err){
            //     System.out.println(err);
            // }
        }
   }
}
