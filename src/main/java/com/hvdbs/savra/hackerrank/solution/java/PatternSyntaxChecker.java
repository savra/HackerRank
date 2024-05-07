package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Pattern Syntax Checker",
        url = "https://www.hackerrank.com/challenges/pattern-syntax-checker"
)
public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases > 0){
            String pattern = in.nextLine();

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(PatternSyntaxException p) {
                System.out.println("Invalid");
            }

            testCases--;
        }
    }
}
