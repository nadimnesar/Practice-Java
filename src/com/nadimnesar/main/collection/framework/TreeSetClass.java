package com.nadimnesar.main.collection.framework;

import java.util.TreeSet;
import java.util.List;

public class TreeSetClass {
    public static void main(String[] args) {
        // Creating a TreeSet to store integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        /*
         * Add operation adds elements to the tree set.
         * Maintains natural ordering of elements (sorted order).
         * Time complexity - O(log n)
         */
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(1);
        printSet(treeSet); // Printing the initial set

        /*
         * It returns the size of the tree set.
         * Return type is always integer.
         * Time complexity - O(1)
         */
        int size = treeSet.size();
        System.out.println("\n\nThe size of the TreeSet is " + size);

        /*
         * Remove operation removes elements from the tree set.
         * Time complexity - O(log n)
         */
        treeSet.remove(3);
        treeSet.remove(1);
        printSet(treeSet); // Printing the set after removals

        /*
         * Checks if the tree set contains a particular element
         * Time complexity - O(log n)
         */
        boolean contains = treeSet.contains(2);
        System.out.println("\n\nThe result of contains is - " + contains);

        /*
         * Checks if the tree set contains all the mentioned elements
         * Time complexity - O(n * log n)
         */
        boolean containsAll = treeSet.containsAll(List.of(1, 2));
        System.out.println("\n\nThe result of containsAll is - " + containsAll);

        /*
         * Clear operation removes all the elements from the tree set.
         * Time complexity - O(n)
         */
        treeSet.clear();
        printSet(treeSet); // Printing the set after clearing
    }

    // Method to print the elements of the TreeSet
    private static void printSet(TreeSet<Integer> treeSet) {
        System.out.println("\n\nPrinting the set");
        for (Integer element : treeSet) {
            System.out.println(element);
        }
    }
}