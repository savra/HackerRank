package com.hvdbs.savra.hackerrank.topics.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.InputMismatchException;
import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Exception Handling (Try-catch)",
        url = "https://www.hackerrank.com/challenges/java-exception-handling-try-catch"
)
public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.println(a / b);
        } catch(InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
