package com.company;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode generate(int... arg) {
        ListNode start = new ListNode(0);
        ListNode operate = start;

        operate.val = arg[0];

        for (int i = 1; i < arg.length; i++) {
            operate.next = new ListNode(0);
            operate = operate.next;
            operate.val = arg[i];
            operate.next = null;
        }
        return start;
    }
}