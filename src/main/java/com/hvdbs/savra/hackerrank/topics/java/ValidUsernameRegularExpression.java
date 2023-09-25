package com.hvdbs.savra.hackerrank.topics.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Valid Username Regular Expression",
        url = "https://www.hackerrank.com/challenges/valid-username-checker"
)
public class ValidUsernameRegularExpression {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z_0-9]{7,29}$";
}
