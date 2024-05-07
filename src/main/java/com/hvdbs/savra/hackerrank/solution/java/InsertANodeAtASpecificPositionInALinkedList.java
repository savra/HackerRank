package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Insert a node at a specific position in a linked list",
        url = "https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list"
)
public class InsertANodeAtASpecificPositionInALinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
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

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (llist == null) {
            return newNode;
        }

        SinglyLinkedListNode cur = llist;
        SinglyLinkedListNode next = llist.next;

        for (int i = 0; i < position - 1; i++) {
            cur = cur.next;
            next = next.next;
        }

        cur.next = newNode;
        newNode.next = next;

        return llist;
    }
}
