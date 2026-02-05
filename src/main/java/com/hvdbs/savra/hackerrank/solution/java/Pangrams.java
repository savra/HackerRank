package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        url = "https://www.hackerrank.com/challenges/pangrams/problem",
        name = "Pangrams",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class Pangrams {
    public static String pangrams(String s) {
        int[] pangram = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));

            if (Character.isDigit(c) || Character.isWhitespace(c)) {
                continue;
            }

            pangram[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (pangram[i] == 0) {
                return "not pangram";
            }
        }

        return "pangram";
    }
}
