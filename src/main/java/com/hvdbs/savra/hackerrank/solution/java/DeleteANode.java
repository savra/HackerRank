package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Delete a Node",
        url = "https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list"
)
public class DeleteANode {
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

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        int i = 1;

        if (llist.next == null) {
            return null;
        }

        if (position == 0) {
            llist = llist.next;
        }

        SinglyLinkedListNode cur = llist, next = llist.next;

        for (; next.next != null; cur = cur.next, next = next.next) {
            if (i == position) {
                cur.next = next.next;
                break;
            }

            i++;
        }

        return llist;
    }
}
