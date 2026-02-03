package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        url = "https://www.hackerrank.com/challenges/making-anagrams/problem",
        name = "Making Anagrams",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.BILINEAR //TODO Должно быть O(N + M), но нет константы
)
public class MakingAnagrams {
    public static int makingAnagrams(String s1, String s2) {
        int[] ar1 = new int[26];
        int[] ar2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            ar1[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            ar2[s2.charAt(i) - 'a']++;
        }

        int result =0;

        for (int i = 0; i < 26; i++) {
            result += Math.abs(ar1[i] - ar2[i]);
        }

        return result;
    }
}
