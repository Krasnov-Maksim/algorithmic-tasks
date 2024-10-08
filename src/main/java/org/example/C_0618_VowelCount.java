package org.example;

import java.util.Arrays;

/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.
 */
public class C_0618_VowelCount {
    public static void main(String[] args) {
        System.out.println(countVowels("iqwafevgbiyyy"));
    }

    private static long countVowels(String data) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        return data.chars()
                .filter(ch -> Arrays.binarySearch(vowels, (char) ch) >= 0)
                .count();
    }
}
