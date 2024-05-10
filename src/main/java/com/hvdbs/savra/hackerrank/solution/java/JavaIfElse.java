package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Java If-Else",
        url = "https://www.hackerrank.com/challenges/java-if-else"
)
public class JavaIfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (2 <= N && N <= 5) {
                System.out.println("Not Weird");
            } else if (6 <= N && N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }

        bufferedReader.close();
    }
}
