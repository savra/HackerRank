package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Interface",
        url = "https://www.hackerrank.com/challenges/java-interface"
)
public class JavaInterface {
    interface AdvancedArithmetic {
        int divisor_sum(int n);
    }

    static class MyCalculator implements AdvancedArithmetic {
        @Override
        public int divisor_sum(int n) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }

            return sum;
        }
    }

    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }

}
