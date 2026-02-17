package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EASY,
        url = "https://www.hackerrank.com/challenges/the-birthday-bar/problem",
        name = "Subarray Division",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int l = 0, r = 0;
        int answer = 0;
        int sum = 0;

        while (r < s.size()) {
            sum += s.get(r);

            if (r >= m - 1) {
                if (sum == d) {
                    answer++;
                }

                sum -= s.get(l);
                l++;
            }

            r++;
        }

        return answer;
    }
}
