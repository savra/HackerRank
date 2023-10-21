package com.hvdbs.savra.hackerrank.topics.datastructures;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Inserting a Node Into a Sorted Doubly Linked List",
        url = "https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list"
)
public class InsertingANodeIntoASortedDoublyLinkedList {
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        if (head == null) {
            return newNode;
        }

        DoublyLinkedListNode cur = head;

        while (cur.next != null) {
            if (cur.data > data) {
                if (cur == head) {
                    newNode.next = cur;
                    cur.prev = newNode;

                    return newNode;
                } else {
                    cur.prev.next = newNode;
                    newNode.prev = cur.prev;
                    newNode.next = cur;
                    cur.prev = newNode;
                }

                return head;
            }

            cur = cur.next;
        }

        if (cur.data > data) {
            cur.prev.next = newNode;
            newNode.prev = cur.prev;
            newNode.next = cur;
            cur.prev = newNode;
        } else {
            cur.next = newNode;
            newNode.prev = cur;
        }

        return head;
    }

    public static void main(String[] args) {
        DoublyLinkedListNode root = new DoublyLinkedListNode(1);
        DoublyLinkedListNode l1 = new DoublyLinkedListNode(2);
        DoublyLinkedListNode l2 = new DoublyLinkedListNode(3);
     //   DoublyLinkedListNode l3 = new DoublyLinkedListNode(10);

        root.next = l1;
        l1.prev = root;
        l1.next = l2;
        l2.prev = l1;
       // l2.next = l3;
       // l3.prev = l2;

        sortedInsert(root, 4);
    }
}
