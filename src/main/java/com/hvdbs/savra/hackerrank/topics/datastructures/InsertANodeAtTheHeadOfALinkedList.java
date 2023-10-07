package com.hvdbs.savra.hackerrank.topics.datastructures;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Insert a node at the head of a linked list",
        url = "https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list"
)
public class InsertANodeAtTheHeadOfALinkedList {
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
    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (llist == null) {
            return newNode;
        }

        newNode.next = llist;

        return newNode;
    }
}
