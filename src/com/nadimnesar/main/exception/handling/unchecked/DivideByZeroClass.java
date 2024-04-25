package com.nadimnesar.main.exception.handling.unchecked;

//Handling excepting for a general purpose method

public class DivideByZeroClass {
    public static void main(String[] args) {
        Integer height = 10;
        Integer weight = 0;
        Integer res1, res2;
        try{
            res1 = divide(height, weight);
            System.out.println(res1);
        }
        catch (ArithmeticException e){
            System.out.println("Weight can't be zero!");
        }


        Integer balance = 10;
        Integer cost = 0;

        try{
            res2 = divide(balance, cost);
            System.out.println(res2);
        }
        catch (ArithmeticException e){
            System.out.println("Cost can't be zero!");
        }
    }

    public static Integer divide(Integer a, Integer b) {
        return (int) a / b;
    }
}