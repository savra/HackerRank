package com.hvdbs.savra.hackerrank.topics.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java 1D Array",
        url = "https://www.hackerrank.com/challenges/java-1d-array-introduction"
)
public class Java1DArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
