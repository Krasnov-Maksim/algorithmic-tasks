package org.example;

import java.util.Arrays;

/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string,
and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Example 2:
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

Example 3:
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
 */
public class C_0624_CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        System.out.println(arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        System.out.println(arrayStringsAreEqual(
                new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        Arrays.stream(word1)
                .forEach(stringBuilder1::append);
        Arrays.stream(word2)
                .forEach(stringBuilder2::append);
        return stringBuilder1.toString().equals(stringBuilder2.toString());
    }
}
