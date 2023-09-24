package com.hvdbs.savra.hackerrank.topics.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Primality Test",
        url = "https://www.hackerrank.com/challenges/java-primality-test"
)
public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger b = new BigInteger(n);

        boolean isPrime = b.isProbablePrime(1);

        System.out.println(isPrime ? "prime" : "not prime");

        bufferedReader.close();
    }
}
