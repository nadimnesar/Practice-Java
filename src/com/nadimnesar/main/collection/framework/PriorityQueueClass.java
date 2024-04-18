package com.nadimnesar.main.collection.framework;

import java.util.PriorityQueue;
import java.util.Collections;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        /*
         * .add(object) operation adds elements to the priority queue.
         * The elements are ordered according to natural ordering.
         * Natural ordering in java: ascending for integer and lexicographically smallest for string.
         * Time complexity - O(log n)
         */

        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(6);
        priorityQueue.add(2);
        System.out.println(priorityQueue);

        /*
         * Retrieves and removes the head of the priority queue.
         * Time complexity - O(log(n))
         */
        System.out.println("Polling element: " + priorityQueue.poll());
        System.out.println(priorityQueue);

        /*
         * Retrieves but does not remove the head of the priority queue.
         * Time complexity - O(1)
         */
        System.out.println("Peeking element: " + priorityQueue.peek());

        /*
         * .size() returns the number of elements in the priority queue.
         * Time complexity - O(1)
         */
        System.out.println("The size of the priorityQueue is " + priorityQueue.size());

        /*
         * .remove(object) remove first occurrence of the specified element from the array queue, if it is present.
         * Time complexity - O(n)
         */
        priorityQueue.remove(2);
        System.out.println(priorityQueue);

        /*
         * Checks if the priority queue contains a particular element.
         * Time complexity - O(n)
         */
        boolean contains = priorityQueue.contains(6);
        System.out.println("The result of contains is - " + contains);

        /*
         * Way of traversing the priority queue.
         * Time complexity - O(n)
         */
        System.out.println("Test");
        priorityQueue.add(9);
        for(Integer i: priorityQueue){
            System.out.println(i);
        }
        /*
         * .clear operation removes all elements from the priority queue.
         * Time complexity - O(n)
         */
        priorityQueue.clear();
    }
}