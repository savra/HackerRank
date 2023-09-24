package com.hvdbs.savra.hackerrank.topics.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Arraylist",
        url = "https://www.hackerrank.com/challenges/java-arraylist"
)
public class JavaArraylist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        List<List<Integer>> res = new ArrayList<>();
        s.nextLine();

        while (n > 0) {
            List<Integer> row = new ArrayList<>();
            String[] line = s.nextLine().split(" ");

            for (int k = 1; k < line.length; k++) {
                row.add(Integer.parseInt(line[k]));
            }

            res.add(row);
            n--;
        }

        int q = s.nextInt();
        s.nextLine();

        while (q > 0) {
            String[] param = s.nextLine().split(" ");

            int x = Integer.parseInt(param[0]);
            int y = Integer.parseInt(param[1]);

            if (x - 1 >= res.size()) {
                System.out.println("ERROR!");
            } else {
                List<Integer> r = res.get(x - 1);

                if (y - 1 >= r.size()) {
                    System.out.println("ERROR!");
                } else {
                    System.out.println(r.get(y - 1));
                }
            }

            q--;
        }
    }
}
