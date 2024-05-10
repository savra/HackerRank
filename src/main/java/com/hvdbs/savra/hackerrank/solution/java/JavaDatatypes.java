package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Java Datatypes",
        url = "https://www.hackerrank.com/challenges/java-datatypes"
)
public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 0;

        while(i < n) {
            String currentNumber = "";

            try {
                currentNumber = s.next();
                long number = Long.parseLong(currentNumber);

                System.out.println(number + " can be fitted in:");

                if (-Math.pow(2, 7) <= number && number <= Math.pow(2, 7) - 1) {
                    System.out.println("* byte");
                }

                if (-Math.pow(2, 15) <= number && number <= Math.pow(2, 15) - 1) {
                    System.out.println("* short");
                }

                if (-Math.pow(2, 31) <= number && number <= Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                }

                if (-Math.pow(2, 63) <= number && number <= Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }
            } catch(java.lang.NumberFormatException e) {
                System.out.println(currentNumber + " can't be fitted anywhere.");
                i++;
                continue;
            }

            i++;
        }
    }
}
