package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@CodeInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Can You Access?",
        url = "https://www.hackerrank.com/challenges/can-you-access"
)
public class CanYouAccess {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
        o = new Inner().new Private();

        System.out.println(num + " is " + ((Inner.Private)o).powerof2(num));

        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

    }//end of main

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }//end of Inner
}