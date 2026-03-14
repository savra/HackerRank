package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CodeInfo(
        difficulty = Difficulty.EASY,
        url = "https://www.hackerrank.com/challenges/icecream-parlor/problem",
        name = "Ice Cream Parlor",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class IceCreamParlor {

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        Map<Integer, Integer> flavors = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            int diff = m - arr.get(i);

            if (flavors.containsKey(diff)) {
                return List.of(flavors.get(diff), i + 1);
            }

            flavors.put(arr.get(i), i + 1);
        }

        return List.of();
    }
}
