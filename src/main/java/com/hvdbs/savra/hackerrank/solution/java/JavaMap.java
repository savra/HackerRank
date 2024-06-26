package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Java Map",
        url = "https://www.hackerrank.com/challenges/phone-book"
)
public class JavaMap {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> res = new HashMap<>();

        for(int i=0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();

            res.put(name, phone);

            in.nextLine();
        }

        while(in.hasNext()) {
            String s = in.nextLine();

            Integer v = res.get(s);
            System.out.println(v == null ? "Not found" : s + "=" + v);
        }
    }
}
