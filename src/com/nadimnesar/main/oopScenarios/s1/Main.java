package com.nadimnesar.main.oopScenarios.s1;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setId("201-15-13636");
        s1.setName("Nesar Ahmed");
        s1.setClassName("L4 T2");
        s1.setSubjectList(List.of("Big Data", "IoT"));

        System.out.println("Id: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("ClassName: " + s1.getClassName());
        System.out.println("Subject List: " + s1.getSubjectList());

        Faculty f1 = new Faculty("Reza Bhai", null, List.of("Java", "Angular", "Spring Boot"), List.of("Batch 01", "Batch 02"));
        f1.printDetails();

        s1.hudai();
        f1.hudai();
    }
}