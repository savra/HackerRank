package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.BitSet;
import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java BitSet",
        url = "https://www.hackerrank.com/challenges/java-bitset"
)
public class JavaBitSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        s.nextLine();

        while (m > 0) {
            String[] str = s.nextLine().split(" ");

            switch (str[0]) {
                case "AND" -> {
                    if ("1".equals(str[1])) {
                        b1.and(b2);
                    } else {
                        b2.and(b1);
                    }
                }
                case "OR" -> {
                    if ("1".equals(str[1])) {
                        b1.or(b2);
                    } else {
                        b2.or(b1);
                    }
                }
                case "XOR" -> {
                    if ("1".equals(str[1])) {
                        b1.xor(b2);
                    } else {
                        b2.xor(b1);
                    }
                }
                case "FLIP" -> {
                    if ("1".equals(str[1])) {
                        b1.flip(Integer.parseInt(str[2]));
                    } else {
                        b2.flip(Integer.parseInt(str[2]));
                    }
                }
                case "SET" -> {
                    if ("1".equals(str[1])) {
                        b1.set(Integer.parseInt(str[2]));
                    } else {
                        b2.set(Integer.parseInt(str[2]));
                    }
                }
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());

            m--;
        }
    }
}
