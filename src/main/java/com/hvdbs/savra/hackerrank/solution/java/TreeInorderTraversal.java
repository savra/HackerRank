package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Deque;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Tree: Inorder Traversal",
        url = "https://www.hackerrank.com/challenges/tree-inorder-traversal")
public class TreeInorderTraversal {
    class Node {
        int data;
        Node left;
        Node right;
    }

    public static void inOrder(Node root) {
        Deque<Node> s = new ArrayDeque<>();

        while (root != null || !s.isEmpty()) {
            while (root != null) {
                s.offerFirst(root);
                root = root.left;
            }

            root = s.pollFirst();
            System.out.print(root.data + " ");
            root = root.right;
        }
    }
}
