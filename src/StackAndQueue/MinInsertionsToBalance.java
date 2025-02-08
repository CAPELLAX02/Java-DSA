package StackAndQueue;

import java.util.Stack;

/**
 * LeetCode 1541: Minimum Insertions to Balance a Parenthesis String
 */
public class MinInsertionsToBalance {
    /**
     *  -> "(" must have a corresponding consecutive "))",
     *  -> "(" must go before the corresponding consecutive "))".
     *
     *  -> In other words, "(" is opening parenthesis, and "))" is closing parenthesis.
     *
     */
    public static void main(String[] args) {
        System.out.println(minInsertions("(()))"));  // 1 -> we only need ")" on the right
        System.out.println(minInsertions(")(())(")); // 0 -> already balanced
        System.out.println(minInsertions("))())(")); // 3 -> we need "(" on the left, and "))" on the right
    }

    static int minInsertions(String s) {
        // TODO
        return 0;
    }
}
