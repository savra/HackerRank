package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java BigInteger",
        url = "https://www.hackerrank.com/challenges/java-biginteger"
)
public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        java.math.BigInteger a = new java.math.BigInteger(s.nextLine());
        java.math.BigInteger b = new java.math.BigInteger(s.nextLine());

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
