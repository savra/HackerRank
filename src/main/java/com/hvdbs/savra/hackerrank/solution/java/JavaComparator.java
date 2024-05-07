package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.Comparator;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Comparator",
        url = "https://www.hackerrank.com/challenges/java-comparator"
)
public class JavaComparator {
    class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    class Checker implements Comparator<Player> {
        @Override
        public int compare(Player p1, Player p2) {
            int scoreCompare = Integer.compare(p1.score, p2.score) * -1;

            if (scoreCompare == 0) {
                return String.CASE_INSENSITIVE_ORDER.compare(p1.name, p2.name);
            } else {
                return scoreCompare;
            }
        }
    }
}
