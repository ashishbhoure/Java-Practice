package stack;

public class StackUse {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(3);
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
