package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Get Node Value",
        url = "https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail"
)
public class GetNodeValue {
    class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode slow = head;

        for (SinglyLinkedListNode faster = head; faster.next != null; faster = faster.next) {
            if (positionFromTail != 0) {
                positionFromTail--;
            } else {
                slow = slow.next;
            }
        }

        return slow.data;
    }
}
