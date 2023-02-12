import java.util.Deque;
import java.util.ArrayDeque;
public class dataStrcut {
public static void main(String[] args){

    // stck is based on last in first out
    // It has stack call sin Java programming.
    // deque interface is better to use it.

    Deque<String> stack =   new ArrayDeque<>();
    stack.push("First request");
    stack.push("Second request");
    stack.push("Third request");
    stack.push("Fourth request");
    System.out.println(stack);
    System.out.println(stack.peek());
    // to remove the fist element on the stack pop is sued.

    stack.pop();
    System.out.println(stack);

    stack.poll();
    System.out.println(stack);







}
}
