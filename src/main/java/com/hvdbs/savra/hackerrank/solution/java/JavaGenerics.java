package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;
import org.springframework.format.Printer;

import java.lang.reflect.Method;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Generics",
        url = "https://www.hackerrank.com/challenges/java-generics"
)
public class JavaGenerics {
    static class Printer {
        <T> void printArray(T[] arr) {
            for (T t : arr) {
                System.out.println(t);
            }
        }
    }

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
