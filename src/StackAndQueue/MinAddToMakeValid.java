package StackAndQueue;

import java.util.Stack;

/**
 * LeetCode 921: Minimum Add to Make Parenthesis Valid
 */
public class MinAddToMakeValid {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())")); // 1
        System.out.println(minAddToMakeValid("(((")); // 3
    }

    static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }
}
