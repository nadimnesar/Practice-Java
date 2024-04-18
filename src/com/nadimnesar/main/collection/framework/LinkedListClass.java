package com.nadimnesar.main.collection.framework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        /*
         * Add operation adds elements to the linked list.
         * It maintains insertion order.
         * Time complexity - O(1)
         */
        linkedList.add(101);
        linkedList.add(102);

        /*
         * Adds elements to the linked list by index number.
         * Time complexity - O(n)
         */
        linkedList.add(2, 103);
        linkedList.add(3, 104);
        System.out.println(linkedList);

        /*
         * It returns the size of the linked list.
         * Return type is always integer.
         * Time complexity - O(1)
         */
        System.out.println("The size of the LinkedList is " + linkedList.size());

        /*
         * Set operation replaces elements to the linked list by specific index number.
         * Time complexity - O(n)
         */
        linkedList.set(0, 201);
        linkedList.set(1, 202);
        System.out.println(linkedList);

        /*
         * Remove operation removes elements of a specific index from the linked list.
         * Time complexity - O(n)
         */
        linkedList.remove(1);
        System.out.println(linkedList);

        /*
         * We can sort any LinkedList using Collections.sort<list>
         * Time complexity - O(n log n)
         */
        Collections.sort(linkedList);
        System.out.println(linkedList);

        /*
         * Adds element to the first position of the linked list.
         * Time complexity - O(1)
         */
        linkedList.addFirst(100);
        System.out.println(linkedList);

        /*
         * Adds element to the last position of the linked list.
         * Time complexity - O(1)
         */
        linkedList.addLast(500);
        System.out.println(linkedList);

        /*
         * Gets the first element of the linked list.
         * Time complexity - O(1)
         */
        System.out.println("The first element is " + linkedList.getFirst());

        /*
         * Gets the last element of the linked list.
         * Time complexity - O(1)
         */
        System.out.println("The last element is " + linkedList.getLast());

        /*
         * Removes the first element from the linked list.
         * Time complexity - O(1)
         */
        linkedList.removeFirst();
        System.out.println(linkedList);

        /*
         * Removes the last element from the linked list.
         * Time complexity - O(1)
         */
        linkedList.removeLast();
        System.out.println(linkedList);

        /*
         * Checks if the linked list contains particular element
         * Time complexity - O(n)
         */
        boolean contains = linkedList.contains(103);
        System.out.println("The result of contain is - " + contains);

        /*
         * Checks if the linked list contains all the mentioned elements
         * Time complexity - O(n)
         */
        boolean containsAll = linkedList.containsAll(List.of(103, 105));
        System.out.println("The result of contain is - " + containsAll);

        /*
         * Checks if the array list contains particular element using Binary Search
         * Time complexity - O(log n)
         * If not found return a -size of the linked list.
         */
        int key = 202;
        int index = Collections.binarySearch(linkedList, key);
        if (index >= 0) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the list");
        }

        /*
         * Way of traversing the linked list.
         * Time complexity - O(n)
         */
        for(Object i: linkedList){
            System.out.println(i);
        }

        /*
         * .clear operation removes all elements from the linked list.
         * The linked list becomes empty after this operation.
         * Time complexity - O(n)
         */
        linkedList.clear();
    }
}
