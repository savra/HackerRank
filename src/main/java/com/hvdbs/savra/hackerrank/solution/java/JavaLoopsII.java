package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Java Loops II",
        url = "https://www.hackerrank.com/challenges/java-loops"
)
public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int q = s.nextInt();

        s.nextLine();

        for (int i = 0; i < q; i++) {
            String[] str = s.nextLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int n = Integer.parseInt(str[2]);

            int sum = a;
            int k = 0;

            for (int j = 0; j < n; j++) {
                while (k < j + 1) {
                    sum += Math.pow(2, k) * b;
                    k++;
                }

                System.out.print(sum + " ");
                sum = a;
                k = 0;
            }

            System.out.println();
        }
    }
}
