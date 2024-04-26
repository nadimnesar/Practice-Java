package com.nadimnesar.main.features;

public class RecordClass {
    public static void main(String[] args) {
        UserClass userClass = new UserClass(201,"Nesar Ahmed", "Bangladesh");
        userClass.printer();
        System.out.println(userClass.fullName());
    }
}

record UserClass(Integer userId, String fullName, String countryName) {
    public void printer(){
        System.out.println(userId);
        System.out.println(countryName);
        System.out.println(fullName);
    }
}