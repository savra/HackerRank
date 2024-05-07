package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Static Initializer Block",
        url = "https://www.hackerrank.com/challenges/java-static-initializer-block"
)
public class JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int b = s.nextInt();
        int h = s.nextInt();

        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return;
        }

        System.out.println(b * h);
    }
}
