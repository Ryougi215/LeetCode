package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Solution solution = new Solution();
	    String[] test = {"a",""};

        List<List<Integer>> result = solution.palindromePairs(test);
        System.out.println(result);
    }
}
