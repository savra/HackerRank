package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Tree: Preorder Traversal",
        url = "https://www.hackerrank.com/challenges/tree-preorder-traversal")
public class TreePreorderTraversal {
    class Node {
        int data;
        Node left;
        Node right;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
