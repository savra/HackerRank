package com.hvdbs.savra.hackerrank.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Print in Reverse",
        url = "https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse"
)
public class PrintInReverse {
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

    public static void reversePrint(SinglyLinkedListNode llist) {
      /*  List<Integer> res = new ArrayList<>();

        for (SinglyLinkedListNode cur = llist; cur != null; cur = cur.next) {
            res.add(cur.data);
        }

        for (int i = res.size() - 1; i >= 0; i--) {
             System.out.println(res.get(i));
        }*/

        if (llist.next == null) {
            System.out.println(llist.data);
        }

        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode cur = llist;
        SinglyLinkedListNode next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        while (prev != null) {
            System.out.println(prev.data);
            prev = prev.next;
        }
    }
}
