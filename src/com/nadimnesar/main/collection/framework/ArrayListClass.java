package com.nadimnesar.main.collection.framework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        /*
         * .add(object) operation adds elements to the end of array list.
         * It maintains insertion order.
         * Time complexity - O(1).
         */

        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(2);
        System.out.println(arrayList);

        /*
         * .add(i, object) operation add element in ith index to the array list.
         * Subsequent elements are shifted after the add operation.
         * Time complexity - O(n)
         */

        arrayList.add(1, 8);
        arrayList.add(3, 9);
        System.out.println(arrayList);

        /*
         * .size() it returns the size of the array list.
         * Return type is always integer.
         * Time complexity - O(1)
         */

        System.out.println("The size of the ArrayList is " + arrayList.size());

        /*
         * .set(i, object) operation replaces ith elements to the array list.
         * Time complexity - O(1)
         */

        arrayList.set(0, 201);
        arrayList.set(1, 202);
        System.out.println(arrayList);

        /*
         * .remove operation removes elements of a specific index from the array list.
         * The subsequent elements are shifted after the removal.
         * Time complexity - O(n)
         */
        arrayList.remove(1);
        System.out.println(arrayList);

        /*
         * We can sort any ArrayList using Collections.sort<list>
         * Time complexity - O(n log(n))
         */
        Collections.sort(arrayList);
        System.out.println(arrayList);

        /*
         * Checks if the array list contains particular element
         * Time complexity - O(n)
         */
        boolean contains = arrayList.contains(201);
        System.out.println("The result of contain is - " + contains);

        /*
         * Checks if the array list contains particular element using Binary Search
         * Time complexity - O(log n)
         * If not found return a -size of the ArrayList.
         */
        int key = 201;
        int index = Collections.binarySearch(arrayList, key);
        if (index >= 0) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the list");
        }

        /*
         * Way of traversing the ArrayList.
         * Time complexity - O(n)
         */
        for(Object i: arrayList){
            System.out.println(i);
        }

        /*
         * .clear operation clear/remove all elements and its allocated space from the memory.
         * ArrayList itself still remain and can use later.
         * Time complexity - O(n)
         */
        arrayList.clear();
    }
}