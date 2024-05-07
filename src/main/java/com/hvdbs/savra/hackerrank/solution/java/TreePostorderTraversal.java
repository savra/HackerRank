package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Deque;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Tree: Postorder Traversal",
        url = "https://www.hackerrank.com/challenges/tree-postorder-traversal")
public class TreePostorderTraversal {
    class Node {
        int data;
        Node left;
        Node right;
    }

    public static void postOrder(Node root) {
        Deque<Node> s = new ArrayDeque<>();
        Node lastVisited = null;

        while (root != null || !s.isEmpty()) {
            if (root != null) {
                s.offerFirst(root);
                root = root.left;
            } else {
                Node cur = s.peekFirst();

                if (cur.right != null && cur.right != lastVisited) {
                    root = cur.right;
                } else {
                    System.out.print(cur.data + " ");
                    lastVisited = s.pollFirst();
                }
            }
        }

       /*
       Recursive

        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);

        System.out.print(root.data + " ");*/
    }
}
