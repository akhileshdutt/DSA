package Stack_Queues;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack ;

public class inbuild {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());


        Queue<Integer> queue = new LinkedList<>();
         queue.add(10); 
         queue.add(20); 
         queue.add(30); 
         queue.add(40); 
         queue.add(50);
        //  System.out.println(queue.peek());             // returns the head element
        //  System.out.println(queue.remove());           // removes the head element, and returns it. 
        queue.remove();                                   // removes 10
        System.out.println(queue.peek());                 // now head is 20, so returns 20


        System.out.println("Deque elements:");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.addLast(50);
        deque.removeFirst();          // removes 10
        deque.removeLast();           // removes 50
        System.out.println(deque);
        

        
    }
}
