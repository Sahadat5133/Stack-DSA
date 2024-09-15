import java.util.Stack;

public class CFG {
    public static void main(String[] args) {
        Stack<String> STACK=new Stack<String>();
        STACK.push("Welcome");
        STACK.push("our");
        STACK.push("new");
        STACK.push("learning");

        System.out.println("Initial Stack: " + STACK);
        System.out.println("Capacity: " + STACK.capacity());

    }
}
