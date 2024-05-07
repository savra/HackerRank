package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java String Tokens",
        url = "https://www.hackerrank.com/challenges/java-string-tokens"
)
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] res = s.split("[\\s!,?._'@]+");

        System.out.println(res.length);

        for (String str : res) {
            System.out.println(str);
        }

        scan.close();
    }
}
