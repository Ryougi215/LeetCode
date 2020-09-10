package com.company;

public class Main {

    public static void main(String[] args) {
	    Solution solution = new Solution();

	    ListNode l1 = ListNode.generate(2,4,3);
	    ListNode l2 = ListNode.generate(5,6,4);

		ListNode result = solution.addTwoNumbers(l1,l2);

    }
}
