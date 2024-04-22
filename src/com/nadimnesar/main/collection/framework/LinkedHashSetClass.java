package com.nadimnesar.main.collection.framework;

import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        // Creating a LinkedHashSet to store integers
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        /*
         * Add operation adds elements to the linked hash set.
         * Maintains insertion order.
         * Time complexity - O(1)
         */
        linkedHashSet.add(5);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        printSet(linkedHashSet); // Printing the initial set

        /*
         * It returns the size of the linked hash set.
         * Return type is always integer.
         * Time complexity - O(1)
         */
        int size = linkedHashSet.size();
        System.out.println("\n\nThe size of the LinkedHashSet is " + size);

        /*
         * Remove operation removes elements from the linked hash set.
         * Since the internal data structure of linked hash set maintains insertion order,
         * the removal operation takes O(1) time if we have the reference to the element to remove.
         */
        linkedHashSet.remove(3);
        linkedHashSet.remove(1);
        printSet(linkedHashSet); // Printing the set after removals

        /*
         * Checks if the linked hash set contains a particular element
         * Time complexity - O(1)
         */
        boolean contains = linkedHashSet.contains(2);
        System.out.println("\n\nThe result of contains is - " + contains);

        /*
         * Checks if the linked hash set contains all the mentioned elements
         * Time complexity - O(n)
         */
        boolean containsAll = linkedHashSet.containsAll(List.of(1, 2));
        System.out.println("\n\nThe result of containsAll is - " + containsAll);

        /*
         * Clear operation removes all the elements from the linked hash set.
         * Time complexity - O(n)
         */
        linkedHashSet.clear();
        printSet(linkedHashSet); // Printing the set after clearing
    }

    // Method to print the elements of the LinkedHashSet
    private static void printSet(LinkedHashSet<Integer> linkedHashSet) {
        System.out.println("\n\nPrinting the set");
        for (Integer element : linkedHashSet) {
            System.out.println(element);
        }
    }
}
