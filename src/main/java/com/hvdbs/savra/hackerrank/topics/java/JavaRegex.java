package com.hvdbs.savra.hackerrank.topics.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Java Regex",
        url = "https://www.hackerrank.com/challenges/java-regex"
)
public class JavaRegex {
    class MyRegex {
        String pattern = "^([0-1]{0,1}[0-9]{0,1}[0-9]{0,1}|2[0-4]{0,1}[0-9]{0,1}|2[0-5]{0,1}[0-5]{0,1})\\.([0-1]{0,1}[0-9]{0,1}[0-9]{0,1}|2[0-4]{0,1}[0-9]{0,1}|2[0-5]{0,1}[0-5]{0,1})\\.([0-1]{0,1}[0-9]{0,1}[0-9]{0,1}|2[0-4]{0,1}[0-9]{0,1}|2[0-5]{0,1}[0-5]{0,1})\\.([0-1]{0,1}[0-9]{0,1}[0-9]{0,1}|2[0-4]{0,1}[0-9]{0,1}|2[0-5]{0,1}[0-5]{0,1})$";
    }
}
