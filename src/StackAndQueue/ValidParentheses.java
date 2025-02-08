package StackAndQueue;

import java.util.Stack;

/**
 * LeetCode 20: Valid Parentheses
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("[{()}]")); // true
        System.out.println(isValid("[{()(}]")); // false
        System.out.println(isValid("{(}")); // false
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return false;
                    }
                    stack.pop();
                }
                if (c == '}') {
                    if (stack.isEmpty() || stack.peek() != '{') {
                        return false;
                    }
                    stack.pop();
                }
                if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
