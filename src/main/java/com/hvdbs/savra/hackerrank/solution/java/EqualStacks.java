package com.hvdbs.savra.hackerrank.solution.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class EqualStacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Deque<Integer> s1 = new ArrayDeque<>();
        Deque<Integer> s2 = new ArrayDeque<>();
        Deque<Integer> s3 = new ArrayDeque<>();

        int sum1 = addElems(h1, s1);
        int sum2 = addElems(h2, s2);
        int sum3 = addElems(h3, s3);

        int min = Math.min(Math.min(sum1, sum2), sum3);

        while (sum1 != sum2 && sum2 != sum3) {
            while (sum1 > min) {
                int tmp = s1.pollFirst();
                sum1 -= tmp;
            }

            while (sum2 > min) {
                int tmp = s2.pollFirst();
                sum2 -= tmp;
            }

            while (sum3 > min) {
                int tmp = s3.pollFirst();
                sum3 -= tmp;
            }

            min = Math.min(Math.min(sum1, sum2), sum3);
        }

        return min;
    }

    private static int addElems(List<Integer> h, Deque<Integer> s) {
        int sum = 0;

        for (int i = h.size() - 1; i >= 0; i--) {
            int tmp = h.get(i);
            sum += tmp;
            s.offer(tmp);
        }

        return sum;
    }

    public static void main(String[] args) {
        equalStacks(List.of(3,2,1,1,1), List.of(4,3,2), List.of(1,1,4,1));
    }
}
