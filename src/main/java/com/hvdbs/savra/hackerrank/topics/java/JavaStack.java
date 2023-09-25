package com.hvdbs.savra.hackerrank.topics.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.function.Predicate;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Java Stack",
        url = "https://www.hackerrank.com/challenges/java-stack"
)
public class JavaStack {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        Deque<Character> stack = new ArrayDeque<>();
        Predicate<Character> openParentheses = (stackHead) -> stackHead.equals('{') || stackHead.equals('(') || stackHead.equals('[');
        Predicate<Character> closeParentheses = (stackHead) -> stackHead.equals('}') || stackHead.equals(')') || stackHead.equals(']');
        boolean isValid = true;

        while (sc.hasNext()) {
            String input = sc.next();

            for (int i = 0; i < input.length(); i++) {
                Character stackHead = stack.peekFirst();

                if (stackHead == null) {
                    if (closeParentheses.test(input.charAt(i))) {
                        isValid = false;
                        break;
                    }

                    stack.offerFirst(input.charAt(i));
                } else {
                    if (openParentheses.test(stackHead) && openParentheses.test(input.charAt(i))) {
                        stack.offerFirst(input.charAt(i));
                    } else if (openParentheses.test(stackHead) && closeParentheses.test(input.charAt(i))) {
                        if (stackHead == '{' && input.charAt(i) == '}'
                                || stackHead == '(' && input.charAt(i) == ')'
                                || stackHead == '[' && input.charAt(i) == ']') {
                            stack.pollFirst();
                        } else {
                            isValid = false;
                            break;
                        }
                    } else if (closeParentheses.test(stackHead) && openParentheses.test(input.charAt(i))
                            || (closeParentheses.test(stackHead) && closeParentheses.test(input.charAt(i)))) {
                        stack.offerFirst(input.charAt(i));
                    }
                }
            }

            if (!isValid) {
                System.out.println("false");
            } else {
                if (stack.isEmpty()) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }

            isValid = true;
            stack.clear();
        }
    }
}
