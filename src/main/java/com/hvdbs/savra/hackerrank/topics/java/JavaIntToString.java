package com.hvdbs.savra.hackerrank.topics.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Int to String",
        url = "https://www.hackerrank.com/challenges/java-int-to-string"
)
public class JavaIntToString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            int a = s.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("Wrong answer");
            return;
        }

        System.out.println("Good job");
    }
}
