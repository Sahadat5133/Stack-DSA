import java.util.Stack;
public class empty {
    public static void main(String[] args) {
        Stack<Integer> STACK=new Stack<Integer>();
        STACK.push(1);
        STACK.push(2);
        STACK.push(3);
        STACK.push(4);
        STACK.push(5);

        System.out.println("The stack is: " + STACK );
       
        System.out.println("If the stack is empty? " + STACK.empty());

        

        System.out.println("Popped element " + STACK.pop());
        System.out.println("Popped element " + STACK.pop());
        System.out.println("Popped element " + STACK.pop());
        System.out.println("Popped element " + STACK.pop());
        System.out.println("Popped element " + STACK.pop());

        System.out.println("If the stack is empty? " + STACK.empty());

    }
}
