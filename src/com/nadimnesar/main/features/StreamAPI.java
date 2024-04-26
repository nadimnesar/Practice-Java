package com.nadimnesar.main.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        // Filtering even element from the array list
        List<Integer> filteredList = arrayList.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(filteredList);

        // Check any element is even or not
        boolean anyEven = arrayList.stream().anyMatch(n -> n%2 == 0);
        System.out.println(anyEven);

        // Filtering elements that country name is Cumilla from the array list
        List<User> userList = new ArrayList<>();
        userList.add(new User("201", "Nesar", "Cumilla"));
        userList.add(new User("202", "Ahmed", "Khilgaon"));
        userList.add(new User("203", "Nadim", "Cumilla"));
        List<User> filteredUserList = userList.stream().filter(e -> e.getUserCountry().equals("Cumilla")).toList();
        filteredUserList.forEach(e -> System.out.println(e.getUserId()));


        //Updating the array list
        List<User> updatedList = userList.stream().map(
                e -> {
                    if (e.getUserCountry().equals("Cumilla")) {
                        User e2 = new User(e);
                        e2.setUserName(e.getUserName() + " " + e.getUserCountry());
                        return e2;
                    }
                    return null;
                }
        ).filter(e -> e != null).toList();
        updatedList.forEach(e -> System.out.println(e));

        //Making a new list of strings with names who's country is from cumilla
        List<String> filteredStringList = userList.stream().map(e -> {
            if (e.getUserCountry().equals("Cumilla"))
                return e.getUserName();
            return null;
        }).filter(e -> e != null).toList();
        filteredStringList.forEach(e -> System.out.println(e));

        // Get the first element of the user list
        System.out.println(userList.stream().findFirst().get());

        //Sorting by descending order
        Comparator < User > cmp = Comparator.comparing(User::getUserName, Comparator.naturalOrder());
        List < User > sortedList = userList.stream().sorted(cmp).collect(Collectors.toList());
        System.out.println("Sorted List:");
        sortedList.forEach(e -> System.out.println(e));

        //looping all elements and reducing to 1 according to a condition
        List<String> words = Arrays.asList("Hello", "world", "of java");
        String concatenated = words.stream().reduce("starting", (partialResult, ith_element) -> partialResult + ith_element);
        System.out.println("Concatenated string: " + concatenated);
    }
}

class User {
    private String userId;
    private String userName;
    private String userCountry;

    public User(String userId, String userName, String userCountry) {
        this.userId = userId;
        this.userName = userName;
        this.userCountry = userCountry;
    }

    public User() {

    }

    public User(User e) {
        this.userId = e.getUserId();
        this.userName = e.getUserName();
        this.userCountry = e.getUserCountry();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userCountry='" + userCountry + '\'' +
                '}';
    }
}