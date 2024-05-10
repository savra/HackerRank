package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Java Stdin and Stdout I",
        url = "https://www.hackerrank.com/challenges/java-stdin-and-stdout-1"
)
public class JavaStdinAndStdoutI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(s.hasNextInt()) {
            System.out.println(s.nextInt());
        }
    }
}
