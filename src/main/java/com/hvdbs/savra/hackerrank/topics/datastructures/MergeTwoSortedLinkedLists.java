package com.hvdbs.savra.hackerrank.topics.datastructures;

import com.hvdbs.savra.hackerrank.statsgenerator.HackerRankInfo;
import com.hvdbs.savra.hackerrank.statsgenerator.enums.Difficulty;

@HackerRankInfo(
        difficulty = Difficulty.EASY,
        name = "Merge two sorted linked lists",
        url = "https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists"
)
public class MergeTwoSortedLinkedLists {
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

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode c1 = head1, c2 = head2;
        SinglyLinkedListNode tmp = new SinglyLinkedListNode(0);
        SinglyLinkedListNode fake = tmp;

        while (true) {
            if (c1 == null) {
                tmp.next = c2;
                break;
            }

            if (c2 == null) {
                tmp.next = c1;
                break;
            }

            if (c1.data < c2.data) {
                tmp.next = c1;
                c1 = c1.next;
            } else {
                tmp.next = c2;
                c2 = c2.next;
            }

            tmp = tmp.next;
        }


        return fake.next;
    }

    public static void main(String[] args) {
        SinglyLinkedListNode root1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode l1 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode l2 = new SinglyLinkedListNode(3);

        root1.next = l1;
        l1.next = l2;

        SinglyLinkedListNode root2 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode ll1 = new SinglyLinkedListNode(4);

        root2.next = ll1;

        mergeLists(root1, root2);
    }
}
