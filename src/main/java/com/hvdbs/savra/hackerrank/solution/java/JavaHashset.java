package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Hashset",
        url = "https://www.hackerrank.com/challenges/java-hashset"
)
public class JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> result = new HashSet<>();

        for (int i = 0; i < t; i++) {
            result.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(result.size());
        }
    }
}
