package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Anagrams",
        url = "https://www.hackerrank.com/challenges/java-anagrams"
)
public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] a1 = a.toLowerCase().toCharArray();
        char[] b1 = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(a1);
        java.util.Arrays.sort(b1);

        return java.util.Arrays.equals(a1, b1);
    }
}
