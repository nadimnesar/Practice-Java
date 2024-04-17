package com.nadimnesar.main.oopScenarios.s1;

import java.util.List;

public class Faculty extends People {
    private List < String > classList;

    public Faculty() {
        super();
    }

    public Faculty(String name, String id, List<String>  subjectList, List<String> classList) {
        super(name, id, subjectList);
        this.classList = classList;
    }

    public List<String> getClassList() {
        return classList;
    }

    public void setClassList(List<String> classList) {
        this.classList = classList;
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Class List: " + classList);
    }

    public void hudai() {
        System.out.println("ok F");
    }
}