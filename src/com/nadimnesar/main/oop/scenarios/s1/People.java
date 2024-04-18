package com.nadimnesar.main.oop.scenarios.s1;
import java.util.List;

public abstract class People {
    private String name;
    private String id;
    private List < String > subjectList;

    public People() {

    }

    public People(String name, String id, List<String> subjectList) {
        this.name = name;
        this.id = id;
        this.subjectList = subjectList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<String> subjectList) {
        this.subjectList = subjectList;
    }

    public void printDetails(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Subject List: " + subjectList);
    }

    public abstract void hudai();
}