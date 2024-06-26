package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Java String Reverse",
        url = "https://www.hackerrank.com/challenges/java-string-reverse"
)
public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        for (int i = 0, j = A.length() - 1; i < j; i++, j--) {
            if (A.charAt(i) != A.charAt(j)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
