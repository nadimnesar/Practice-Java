package com.nadimnesar.main.features;

import java.util.ArrayList;
import java.util.List;

interface DefaultInterface{
    default void lifeHi(){
        System.out.println("Hi to Life!");
        lifeBye();
    }

    private void lifeBye(){
        System.out.println("Bye to Life!");
    }

    static void lifeNow(){
        System.out.println("Life is now!");
    }
}

public class MethodFeatures implements DefaultInterface {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Nesar");
        arrayList.add("Ahmed");
        arrayList.add("Nadim");
        arrayList.forEach(MethodFeatures::printer);

        List<Student> updatedList = arrayList.stream().map(Student::new).toList();
        updatedList.forEach(Student::studentPrinter);

        DefaultInterface.lifeNow();
        MethodFeatures obj = new MethodFeatures();
        obj.lifeHi();
    }

    public static void printer(String s) {
        System.out.println(s);
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void studentPrinter() {
        System.out.println(this.name);
    }
}