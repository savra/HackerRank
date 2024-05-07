package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java List",
        url = "https://www.hackerrank.com/challenges/java-list"
)
public class JavaList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        String[] lst = s.nextLine().split(" ");

        List<Integer> result = new ArrayList<>();

        for (String value : lst) {
            result.add(Integer.valueOf(value));
        }

        int q = s.nextInt();

        s.nextLine();

        while (q > 0) {
            String query = s.nextLine();

            String[] params = s.nextLine().split(" ");

            if ("Insert".equals(query)) {
                result.add(Integer.parseInt(params[0]), Integer.parseInt(params[1]));
            } else {
                result.remove(Integer.parseInt(params[0]));
            }

            q--;
        }

        for (Integer v : result) {
            System.out.print(v + " ");
        }
    }
}
