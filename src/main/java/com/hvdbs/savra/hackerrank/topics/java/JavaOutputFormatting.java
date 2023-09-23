package com.hvdbs.savra.hackerrank.topics.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Output Formatting",
        url = "https://www.hackerrank.com/challenges/java-output-formatting"
)
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("%s", "================================");
        System.out.println();

        while(s.hasNextLine()) {
            String[] str = s.nextLine().split(" ");

            System.out.printf("%-15s%03d", str[0], Integer.parseInt(str[1]));
            System.out.println();
        }

        System.out.printf("%s", "================================");
    }
}
