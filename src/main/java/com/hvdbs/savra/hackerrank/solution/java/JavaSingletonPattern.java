package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
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
