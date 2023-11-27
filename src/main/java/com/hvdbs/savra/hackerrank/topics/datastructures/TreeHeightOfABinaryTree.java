package com.hvdbs.savra.hackerrank.topics.datastructures;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Tree: Height of a Binary Tree",
        url = "https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree")
public class TreeHeightOfABinaryTree {
    class Node {
        int data;
        Node left;
        Node right;
    }

    static int maxDepth = 0;

    public static int height(Node root) {
        Integer depth = 0;

        maxHeightSearch(root, depth);

        return maxDepth - 1;
    }

    private static void maxHeightSearch(Node root, Integer depth) {
        if (root == null) {
            return;
        }

        depth++;

        if (maxDepth < depth) {
            maxDepth = depth;
        }

        maxHeightSearch(root.left, depth);
        maxHeightSearch(root.right, depth);
    }
}
