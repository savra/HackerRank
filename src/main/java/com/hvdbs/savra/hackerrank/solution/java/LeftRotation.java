package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EASY,
        url = "https://www.hackerrank.com/challenges/array-left-rotation/problem",
        name = "Left Rotation",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR
)
public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> result = new ArrayList<>(Collections.nCopies(arr.size(), 0));

        for (int i = 0; i < result.size(); i++) {
            result.set((i - d + arr.size()) % arr.size(), arr.get(i));
        }

        return result;
    }
}
