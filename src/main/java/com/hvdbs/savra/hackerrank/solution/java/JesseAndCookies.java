package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Jesse and Cookies",
        url = "https://www.hackerrank.com/challenges/jesse-and-cookies")
public class JesseAndCookies {
    public static int cookies(int k, List<Integer> A) {
        int operationCount = 0;

        if (A.size() == 1) {
            if (A.get(0) >= k) {
                return 0;
            } else {
                return -1;
            }
        }

        Queue<Integer> heap = new PriorityQueue<>();
        heap.addAll(A);

        while (heap.peek() < k && heap.size() > 1) {
            int min1 = heap.poll();
            int min2 = heap.poll();

            heap.offer(min1 + 2 * min2);
            operationCount++;
        }

        if (heap.peek() < k) {
            return -1;
        }

        return operationCount;
    }
}
