import java.util.*;
// import java.util.Queue;
// import java.util.Stack;

public class Stack3 {
    public static void main(String[] args) {
        // Stack implementation
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack (LIFO) Operations:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
         
        System.out.println("Queue (FIFO) Operations:");
        while (!queue.isEmpty()) {
            System.out.println("Popped: " + queue.poll());
        }
    }
};