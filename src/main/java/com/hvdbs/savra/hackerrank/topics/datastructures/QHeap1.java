package com.hvdbs.savra.hackerrank.topics.datastructures;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "QHEAP1",
        url = "https://www.hackerrank.com/challenges/qheap1")
public class QHeap1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count = s.nextInt();

        Queue<Integer> heap = new PriorityQueue<>();

        while (count > 0) {
            int queryType = s.nextInt();

            if (queryType == 1) {
                int value = s.nextInt();
                heap.offer(value);
            } else if (queryType == 2) {
                int value = s.nextInt();
                heap.remove(value);
            } else {
                System.out.println(heap.peek());
            }

            count--;
        }
    }
}
