package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Solve Me First",
        url = "https://www.hackerrank.com/challenges/solve-me-first"
)
public class SolveMeFirst {
    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
