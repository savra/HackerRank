package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Delete duplicate-value nodes from a sorted linked list",
        url = "https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list"
)
public class DeleteDuplicateValueNodesFromASortedLinkedList {

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

    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        for (SinglyLinkedListNode prev = head, cur = head.next; cur != null; ) {
            if (cur.data == prev.data) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }

            cur = cur.next;
        }

        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode root = new SinglyLinkedListNode(3);
        SinglyLinkedListNode l1 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode l2 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode l3 = new SinglyLinkedListNode(4);
        SinglyLinkedListNode l4 = new SinglyLinkedListNode(5);
        SinglyLinkedListNode l5 = new SinglyLinkedListNode(5);

        root.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        removeDuplicates(root);
    }
}
