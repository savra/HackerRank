package com.hvdbs.savra.hackerrank.topics.datastructures;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Maximum Element",
        url = "https://www.hackerrank.com/challenges/maximum-element"
)
public class MaximumElement {
    public static List<Integer> getMax(List<String> operations) {
        Deque<Integer> st = new ArrayDeque<>();
        Deque<Integer> tmpSt = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (String s : operations) {
            if (s.length() == 1) {
                if (s.charAt(0) == '2') {
                    Integer polled = st.pollFirst();

                    if (polled == max) {
                        while (!st.isEmpty()) {
                            tmpSt.offerFirst(st.pollFirst());
                        }

                        max = Integer.MIN_VALUE;

                        while (!tmpSt.isEmpty()) {
                            int tmpPol = tmpSt.pollFirst();

                            if (tmpPol > max) {
                                max = tmpPol;
                            }

                            st.offerFirst(tmpPol);
                        }
                    }
                } else {
                    res.add(max);
                }
            } else {
                int tmp = Integer.parseInt(s.substring(s.lastIndexOf(' ') + 1));

                if (tmp > max) {
                    max = tmp;
                }

                st.offerFirst(max);
            }
        }

        return res;
    }
}
