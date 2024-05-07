package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Subarray",
        url = "https://www.hackerrank.com/challenges/java-negative-subarray"
)
public class JavaSubarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] a = new int[n];

        int i = 0;

        while(s.hasNextInt()) {
            a[i] = s.nextInt();
            i++;
        }

        int sum = 0;
        int negativeSumCount = 0;

        for (int j = 0; j < a.length; j++) {
            for (int k = j; k < a.length; k++) {
                sum += a[k];

                if (sum < 0) {
                    negativeSumCount++;
                }
            }

            sum = 0;
        }

        System.out.println(negativeSumCount);
    }
}
