package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} 
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }

        // Display 
        System.out.println("Elements of queue: " + q);

        // To remove the head of queue
        int removedele = q.remove();
        System.out.println("Removed element: " + removedele);

        System.out.println("Queue after removal: " + q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("Head of queue: " + head);

        int size = q.size();
        System.out.println("Size of queue: " + size);
    }
}
