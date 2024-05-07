package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;

@HackerRankInfo(
        difficulty = Difficulty.MEDIUM,
        name = "Prime Checker",
        url = "https://www.hackerrank.com/challenges/prime-checker"
)
public class PrimeChecker {
    static class Prime {
        void checkPrime(int... arr) {
            for (int i : arr) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        private boolean isPrime(int source) {
            if (source < 2) {
                return false;
            }

            boolean isPrime = true;

            for (int i = 2; i <= source / 2; i++) {
                if (source % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            return isPrime;
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);

            Method[] methods = Prime.class.getDeclaredMethods();

            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
