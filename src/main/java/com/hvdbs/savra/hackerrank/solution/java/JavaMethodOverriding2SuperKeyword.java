package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Method Overriding 2 (Super Keyword)",
        url = "https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword"
)
public class JavaMethodOverriding2SuperKeyword {
    static class BiCycle {
        String define_me() {
            return "a vehicle with pedals.";
        }
    }

    static class MotorCycle extends BiCycle {
        String define_me() {
            return "a cycle with an engine.";
        }

        MotorCycle() {
            System.out.println("Hello I am a motorcycle, I am " + define_me());

            String temp = super.define_me(); //Fix this line

            System.out.println("My ancestor is a cycle who is " + temp);
        }

    }

    public static void main(String[] args) {
        MotorCycle M = new MotorCycle();
    }

}
