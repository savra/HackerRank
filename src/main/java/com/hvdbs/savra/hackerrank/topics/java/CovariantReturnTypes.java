package com.hvdbs.savra.hackerrank.topics.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Covariant Return Types",
        url = "https://www.hackerrank.com/challenges/java-covariance"
)
public class CovariantReturnTypes {
    class Flower {
        String whatsYourName() {
            return "I have many names and types.";
        }
    }

    class Jasmine extends Flower {
        String whatsYourName() {
            return "Jasmine";
        }
    }

    class Lily extends Flower {
        String whatsYourName() {
            return "Lily";
        }
    }

    class Region {
        Flower yourNationalFlower() {
            return new Flower();
        }
    }

    class WestBengal extends Region  {
        Jasmine yourNationalFlower() {
            return new Jasmine();
        }
    }

    class AndhraPradesh extends Region {
        Lily yourNationalFlower() {
            return new Lily();
        }
    }
}
