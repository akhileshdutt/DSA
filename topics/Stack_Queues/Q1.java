package Stack_Queues;
import java.util.*;

public class Q1 {
    // Implementing Queue using Stacks
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack();
        Stack<Integer> stack2 = new Stack();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        System.out.println("Elements in Stack1: " + stack1);
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        System.out.println("Elements in Stack2 (Queue): " + stack2);

        stack1.push(50);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        System.out.println("Elements in Stack1 (Stack After Pushing 50): " + stack1);

        System.out.println("------------------Using Class------------------");

        QueueUsignStack queue = new QueueUsignStack();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println("Element removed from Queue: " + queue.remove());
        System.out.println("Element at front of Queue: " + queue.peek());
        System.out.println("Is Queue empty? " + queue.isEmpty());
            
    }

    static class QueueUsignStack{                                              // creating my own class for Queue using Stacks
        private Stack<Integer> first;
        private Stack<Integer> second;
        
        public QueueUsignStack(){
            first = new Stack<>();
            second = new Stack<>();
        }

        public void add(int data){
            first.push(data);
        }

        public int remove(){
            if(second.isEmpty()){
                while(!first.isEmpty()){
                    second.push(first.pop());
                }
            }
            int removed = second.pop();

            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return removed;
        }

        public int peek(){
            if(second.isEmpty()){
                while(!first.isEmpty()){
                    second.push(first.pop());
                }
            }
            int peeked = second.pop();

            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return peeked;

        }
        public boolean isEmpty(){
            return first.isEmpty();
        }
     }
}
