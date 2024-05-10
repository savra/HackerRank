package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "2D Array - DS",
        url = "https://www.hackerrank.com/challenges/2d-array"
)
public class TwoDArrayDS {
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int hourglassSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                maxSum = Math.max(maxSum, hourglassSum);
            }
        }

        return maxSum;
    }
}
