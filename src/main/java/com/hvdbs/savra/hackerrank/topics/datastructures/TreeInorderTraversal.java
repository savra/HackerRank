package com.hvdbs.savra.hackerrank.topics.datastructures;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Deque;

@HackerRankInfo(
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
