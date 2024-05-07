package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Singleton Pattern",
        url = "https://www.hackerrank.com/challenges/java-singleton"
)
public class JavaSingletonPattern {
    static class Singleton {
        public String str;
        private static Singleton INSTANCE = new Singleton();

        private Singleton() {}

        public static Singleton getSingleInstance() {
            return INSTANCE;
        }
    }
}
