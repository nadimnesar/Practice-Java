package com.nadimnesar.main.features;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        List<Integer> filteredList = arrayList.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(filteredList);

        List<User> userList = new ArrayList<>();
        userList.add(new User("201", "Nesar", "Cumilla"));
        userList.add(new User("202", "Ahmed", "Khilgaon"));
        userList.add(new User("203", "Nadim", "Cumilla"));

        List<User> filteredUserList = userList.stream().filter(e -> e.getUserCountry().equals("Cumilla")).toList();
        filteredUserList.forEach(e -> System.out.println(e.getUserId()));

//        List<User> updatedList = userList.stream().map(
//                e -> {
//                    if (e.getUserCountry().equals("Cumilla")) {
//                        e.setUserName(e.getUserName() + " " + e.getUserCountry());
//                        return e;
//                    }
//                    return null;
//                }
//        ).filter(e -> e != null).toList();
//        updatedList.forEach(e -> System.out.println(e.getUserName()));

        System.out.println("Cumilla's usernames:");
        List<String> filteredStringList = userList.stream().map(e -> {
            if (e.getUserCountry().equals("Cumilla"))
                return e.getUserName();
            return null;
        }).filter(e -> e != null).toList();

        filteredStringList.forEach(e -> System.out.println(e));
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
}