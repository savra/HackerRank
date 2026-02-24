package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Container With Most Water",
        url = "https://leetcode.com/problems/container-with-most-water/description/",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxSquare = 0;

        for (int i = 0, j = height.length - 1; i < j; ) {
            maxSquare = Math.max((j - i) * Math.min(height[i], height[j]), maxSquare);

            if (height[i + 1] > height[j - 1]) {
                i++;
            } else {
                j--;
            }
        }

        return maxSquare;
    }
}
