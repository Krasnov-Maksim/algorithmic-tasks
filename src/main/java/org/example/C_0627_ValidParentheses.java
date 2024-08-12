package org.example;

/*
20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
 */
public class C_0627_ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        int deletionCount = 100;
        while (deletionCount != 0) {
            deletionCount = 0;
            deletionCount += patternDeleted(sb, "[]");
            deletionCount += patternDeleted(sb, "{}");
            deletionCount += patternDeleted(sb, "()");
        }
        return sb.length() == 0;
    }

    private static int patternDeleted(StringBuilder sb, String pattern) {
        int idx;
        if ((idx = sb.indexOf(pattern)) >= 0) {
            sb.deleteCharAt(idx);
            sb.deleteCharAt(idx);
            return 1;
        }
        return 0;
    }
}
