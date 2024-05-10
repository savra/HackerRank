package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Java Strings Introduction",
        url = "https://www.hackerrank.com/challenges/java-strings-introduction"
)
public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        System.out.println(a.length() + b.length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b.substring(1));
    }
}
