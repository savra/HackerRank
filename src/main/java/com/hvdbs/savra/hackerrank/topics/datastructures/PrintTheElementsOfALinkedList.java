package com.hvdbs.savra.hackerrank.topics.datastructures;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Print the Elements of a Linked List",
        url = "https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list"
)
public class PrintTheElementsOfALinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    static void printLinkedList(SinglyLinkedListNode head) {
        for(SinglyLinkedListNode cur = head; cur != null; cur = cur.next) {
            System.out.println(cur.data);
        }
    }
}
