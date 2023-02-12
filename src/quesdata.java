import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class quesdata {
    public static void main(String[] args){

        // This is a queue impllmentation in Java programming.

        // queue has many ways to implement in java one is arraydeque

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Person one");
        queue.offer("Person Two");
        queue.offer("Person three");
        System.out.println(queue);

        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);


    }
}
