package com.nadimnesar.main.collection.framework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<String, Object> treeMap = new TreeMap<>();

        // Put(key, value) operation adds elements to the tree map.
        // It maintains natural ordering based on keys.
        // Time complexity - O(log N)
        treeMap.put("Name", "Nesar Ahmed");
        treeMap.put("Age", 24);
        treeMap.put("Years of Experience", 0);
        printTreeMap(treeMap);

        // Get(key) operation gets a particular element's value via a key.
        // It returns null if key not found.
        // Time complexity - O(log N)
        Object value = treeMap.get("Age");
        System.out.println("\n\nThe value of Age is " + value);

        // ContainsKey(key) operation checks if a particular key is present in the tree map or not.
        // It returns true if key found. Else returns false;
        // Time complexity - O(log N)
        boolean isPresent = treeMap.containsKey("Age");
        System.out.println("\n\nThe key Age is present: " + isPresent);

        // Remove(key) operation removed a particular key if it is present in the tree map.
        // After successful removal, it returns the value of the key.
        // Time complexity - O(log N)
        Object removedValue = treeMap.remove("Age");
        System.out.println("\n\nThe key Age is removed. And the value was: " + removedValue);

        // It returns the size of the tree map.
        // Return type is always integer.
        // Time complexity - O(1)
        int size = treeMap.size();
        System.out.println("\n\nThe size of the tree map is: " + size);

        // It checks if the tree map is empty or not.
        // Time complexity - O(1)
        boolean isEmpty = treeMap.isEmpty();
        System.out.println("\n\nThe tree map is empty: " + isEmpty);

        TreeMap<String, Object> anotherTreeMap = new TreeMap<>();
        anotherTreeMap.put("Tech Stack", "Java, Angular");
        anotherTreeMap.put("Databases", "MySql, Postgres");

        // PutAll(Map<k, v>) operation adds an entire map to the existing tree map.
        // Time complexity - O(N log N)
        treeMap.putAll(anotherTreeMap);
        printTreeMap(treeMap);

        // Clear() operation deletes all the elements from the tree map.
        // Time complexity - O(N)
        treeMap.clear();
        printTreeMap(treeMap);
    }

    private static void printTreeMap(TreeMap<String, Object> treeMap) {
        System.out.println("\n\nPrinting the tree map");
        for (Map.Entry<String, Object> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }
    }
}
