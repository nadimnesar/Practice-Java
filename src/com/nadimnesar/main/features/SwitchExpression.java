package com.nadimnesar.main.features;

public class SwitchExpression {
    public static void main(String[] args) {
        printDayName(1);
        printDayName(9);
    }

    public static void printDayName(Integer dayNum){
        switch (dayNum){
            case 1 -> System.out.println("Sat");
            case 2 -> System.out.println("Sun");
            case 3 -> System.out.println("Mon");
            case 4 -> System.out.println("Tue");
            case 5 -> System.out.println("Wed");
            case 6 -> System.out.println("Thurs");
            case 7 -> System.out.println("Fri");
            default -> System.out.println("Invalid input");
        }
    }
}