package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Arrays - DS",
        url = "https://www.hackerrank.com/challenges/arrays-ds"
)
public class ArraysDS {
    class Result {

        /*
         * Complete the 'reverseArray' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY a as parameter.
         */

        public static List<Integer> reverseArray(List<Integer> a) {
            List<Integer> res = new ArrayList<>(a.size());

            for (int i = a.size() - 1; i >= 0; i--) {
                res.add(a.get(i));
            }

            return res;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> res = Result.reverseArray(arr);

            bufferedWriter.write(
                    res.stream()
                            .map(Object::toString)
                            .collect(joining(" "))
                            + "\n"
            );

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
