package com.nadimnesar.main.exception.handling.checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileManipulate {
    public static void main(String[] args) {
        openFileE2(); //here no error because checked exception handled in a wrong manner.
        System.out.println("fileE2 open done!");

        try { // here this is the last layer where openFileE1 called and here exception handled.
            openFileE1();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("fileE1 open done!");
    }

    public static void openFileE1() throws FileNotFoundException { //for checked exception handle the exception in last layer.
        String currDir = System.getProperty("user.dir");
        String fileName = "my_files.txt";  //wrong file
        String pathAddress = currDir + "/src/com/nadimnesar/main/exception/handling/checked/" + fileName;

        File file = new File(pathAddress);

        FileInputStream fileInputStream = new FileInputStream(file);
    }

    public static void openFileE2() { //bad way
        String currDir = System.getProperty("user.dir");
        String fileName = "my_files.txt"; //wrong file
        String pathAddress = currDir + "/src/com/nadimnesar/main/exception/handling/checked/" + fileName;

        File file = new File(pathAddress);

        try { //this is a bad way to handle checked exception
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}