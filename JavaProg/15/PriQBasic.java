import java.util.*;
class DemoQueue {
    public static void main(String[] args) {
//Priority Queue can also be used with generics  
//Priority Queue inserts the items in sorted order(ascending order)  
        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(4);
        queue.add(2);
        
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.size());
    }
}