package queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String args[]) {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Core Java");
        pq.add("React");
        pq.add("HTML");
        pq.add("Angular");

        System.out.println("Initial PriorityQueue: " + pq);

        pq.remove("Angular");
        System.out.println("After Remove 'Angular': " + pq);

        System.out.println("Poll Method Removes and Returns Head: " + pq.poll());

        System.out.println("Final PriorityQueue: " + pq);

        Iterator<String> iterator = pq.iterator();
        System.out.print("Iterating over PriorityQueue: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Printing the top element of the PriorityQueue
        System.out.println("Peek Method (Top Element): " + pq.peek());

        // Printing the top element and removing it from the PriorityQueue container
        System.out.println("Poll Method Removes and Returns Head: " + pq.poll());

        // Printing the top element again
        System.out.println("Peek Method (Top Element After Poll): " + pq.peek());
    }

}

