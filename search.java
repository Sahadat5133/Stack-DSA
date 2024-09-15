import java.util.*;
public class search{
    public static void main(String[] args) {
       Stack<String> STACK=new Stack<String>();
       STACK.push("Sahadat");
       STACK.push("4");
       STACK.push("must");
       STACK.push("learn");
       STACK.push("java");

       System.out.println("The stack is: " + STACK);
       System.out.println("Does the stack contain '4'? " + STACK.search("4"));
       System.out.println("Does the stack contain 'Sahadat'? " + STACK.search("Sahadat"));
       System.out.println("Does the stack contain 'Hello'? " + STACK.search("Hello"));
       
    }
}