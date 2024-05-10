package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Java Substring Comparisons",
        url = "https://www.hackerrank.com/challenges/java-string-compare"
)
public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        java.util.List<String> lst = new java.util.ArrayList<>();

        for (int i = 0; i <= s.length() - k; i++) {
            String tmp = s.substring(i, i + k);
            lst.add(tmp);
        }

        lst.sort(String::compareTo);

        smallest = lst.get(0);
        largest = lst.get(lst.size() - 1);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }
}
