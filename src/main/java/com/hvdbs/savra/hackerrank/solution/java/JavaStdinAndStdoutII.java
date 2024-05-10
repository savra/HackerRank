package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Java Stdin and Stdout II",
        url = "https://www.hackerrank.com/challenges/java-stdin-stdout"
)
public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        double b = s.nextDouble();
        s.nextLine();
        String str = s.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
