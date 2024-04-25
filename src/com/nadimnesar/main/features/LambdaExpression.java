package com.nadimnesar.main.features;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface TriFunction<A, B, C, R> {
    R apply(A a, B b, C c);
}

public class LambdaExpression {
    public static void main(String[] args) {
        // lambda operator -> body

        // for zero parameter
        Runnable zpl = () -> System.out.println("Zero parameter lambda");
        zpl.run();

        // for one parameter
        Function<Integer, Integer> multiplyByTwo = (num) -> num * 2;
        System.out.println(multiplyByTwo.apply(4));

        // for two parameter
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(4, 6));

        // for three parameter
        TriFunction<Integer, Integer, Integer, Integer> calc = (a, b, c) -> a * b * c;
        System.out.println(calc.apply(2, 3, 5));

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println("Using lambda expression to print all elements");
        arrayList.forEach(n -> System.out.println(n));

        System.out.println("Using lambda expression to print even elements");
        arrayList.forEach(
                n -> {
                    if (n % 2 == 0)
                        System.out.println(n);
                }
        );
    }
}