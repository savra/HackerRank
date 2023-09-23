package com.hvdbs.savra.hackerrank.topics.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Currency Formatter",
        url = "https://www.hackerrank.com/challenges/java-currency-formatter"
)
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double source = s.nextDouble();

        DecimalFormat IndianCurrencyFormat = new DecimalFormat("##,##,###.00");
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = nf.format(source);
        String india ="Rs." + IndianCurrencyFormat.format(source);
        String china =nf1.format(source);
        String france =nf2.format(source);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
