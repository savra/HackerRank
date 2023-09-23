package com.hvdbs.savra.hackerrank.topics.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java End-of-file",
        url = "https://www.hackerrank.com/challenges/java-end-of-file"
)
public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i = 1;

        while(s.hasNextLine()) {
            System.out.println(i + " " + s.nextLine());
            i++;
        }
    }
}
