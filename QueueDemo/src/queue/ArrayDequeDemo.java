package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {

    public static void main(String[] args) {
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("A");
        arrayDeque.add("B");
        arrayDeque.add("C");

        // offerFirst adds elements at the front of the ArrayDeque
        arrayDeque.offer("F");

        // offerFirst inserts the element at the front of the ArrayDeque
        arrayDeque.offerFirst("D");

        // offerLast inserts the element at the end of the ArrayDeque
        arrayDeque.offerLast("E");

        Iterator<String> itr = arrayDeque.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("After poll");
        String s = arrayDeque.poll();
        System.out.println("Polled Item is: " + s);

        for (String item : arrayDeque) {
            System.out.println(item);
        }
    }
}

