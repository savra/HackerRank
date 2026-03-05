package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Sparse Arrays",
        url = "https://www.hackerrank.com/challenges/sparse-arrays/problem",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR, //O(N + M)
        timeComplexity = Complexity.ConstantComplexity.LINEAR //O(N + M)

)
public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> freq = new LinkedHashMap<>();

        for(String s : stringList) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for(String s : queries) {
            result.add(freq.getOrDefault(s, 0));
        }

        return result;
    }
}
