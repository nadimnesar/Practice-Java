package com.nadimnesar.main.collection.framework;

import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        /*
         * .add(object) operation adds elements to the end of the array deque.
         * It maintains insertion order.
         * Time complexity - O(1)
         */

        arrayDeque.add(2);
        arrayDeque.add(1);
        arrayDeque.add(6);
        arrayDeque.add(2);
        System.out.println(arrayDeque);

        /*
         * Adds an element to the first position of the array deque.
         * Time complexity - O(1)
         */
        arrayDeque.addFirst(100);
        System.out.println(arrayDeque);

        /*
         * Adds an element to the last position of the array deque.
         * Time complexity - O(1)
         */
        arrayDeque.addLast(500);
        System.out.println(arrayDeque);

        /*
         * Retrieves the first element of the array deque.
         * Time complexity - O(1)
         */
        System.out.println("The first element is " + arrayDeque.getFirst());

        /*
         * Retrieves the last element of the array deque.
         * Time complexity - O(1)
         */
        System.out.println("The last element is " + arrayDeque.getLast());

        /*
         * Removes the first element from the array deque.
         * Time complexity - O(1)
         */
        arrayDeque.removeFirst();
        System.out.println(arrayDeque);

        /*
         * Removes the last element from the array deque.
         * Time complexity - O(1)
         */
        arrayDeque.removeLast();
        System.out.println(arrayDeque);

        /*
         * .size() returns the size of the array deque.
         * Return type is always integer.
         * Time complexity - O(1)
         */
        System.out.println("The size of the arrayDeque is " + arrayDeque.size());

        /*
         * .remove(object) remove first occurrence of the specified element from the array queue, if it is present.
         * Time complexity - O(n)
         */
        arrayDeque.remove(1);
        System.out.println(arrayDeque);

        /*
         * Checks if the array deque contains a particular element.
         * Time complexity - O(n)
         */
        boolean contains = arrayDeque.contains(2);
        System.out.println("The result of contains is - " + contains);

        /*
         * Traverses the arrayDeque.
         * Time complexity - O(n)
         */
        for(Integer i: arrayDeque){
            System.out.println(i);
        }
        /*
         * .clear operation clears/removes all elements and their allocated space from the memory.
         * The arrayDeque itself still remains and can be used later.
         * Time complexity - O(n)
         */
        arrayDeque.clear();
    }
}