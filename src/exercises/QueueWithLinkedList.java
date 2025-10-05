package exercises;

import java.util.LinkedList;

public class QueueWithLinkedList {
    public static void main(String[] args) {

        // create a queue using a linked list
        LinkedList<String> queue = new LinkedList<>();

        // add element to the queue (enqueue)
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue after adding elements: " + queue);

        // peek --> look at the first element without removing it
        System.out.println("Front of the queue: " + queue.peek());

        // remove elements from the queue (dequeue)
        String removed = queue.remove(); // removes the first element (FIFO)
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after removing elements: " + queue);

        // check the size of the queue
        System.out.println("Size of the queue: " + queue.size()); // shows how many elements are in the queue

        // check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
