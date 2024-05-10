package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Valid Username Regular Expression",
        url = "https://www.hackerrank.com/challenges/valid-username-checker"
)
public class ValidUsernameRegularExpression {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z_0-9]{7,29}$";
}
