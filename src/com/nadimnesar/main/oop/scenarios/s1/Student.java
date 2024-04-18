package com.nadimnesar.main.oop.scenarios.s1;

import java.util.List;

public class Student extends People {
    private String className;

    public Student() {
        super();
    }

    public Student(String name, String id, List<String> subjectList, String className) {
        super(name, id, subjectList);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Class Name: " + className);
    }

    @Override
    public void hudai() {
        System.out.println("ok");
    }
}