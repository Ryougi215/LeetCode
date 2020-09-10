package com.company;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode operate = result;
        int up = 0;

        while(true) {

            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            operate.val = (val1 + val2 + up) % 10;

            up = (val1 + val2 + up) / 10;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

            if(l1 == null && l2 == null && up == 0) {
                break;
            }

            operate.next = new ListNode(0);
            operate = operate.next;
        }

        operate.next = null;

        return result;
    }
}
