package org.example;

/*
Description:
You are going to be given a word. Your job is to return the middle character of the word.
If the word's length is odd, return the middle character.
If the word's length is even, return the middle 2 characters.

#Examples:

Kata.getMiddle("test") should return "es"

Kata.getMiddle("testing") should return "t"

Kata.getMiddle("middle") should return "dd"

Kata.getMiddle("A") should return "A"

#Input
A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in
some test cases due to an error in the test cases). You do not need to test for this.
This is only here to tell you that you do not need to worry about your solution timing out.

#Output
The middle character(s) of the word represented as a string.
 */
public class C_0626_GetTheMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("A"));
    }

    private static String getMiddle(String word) {
        if (word.length() == 1) {
            return word;
        }
        int index = word.length() / 2;
        if (word.length() % 2 == 0){
            return "" + word.charAt(index - 1) + word.charAt(index);
        } else {
            return "" + word.charAt(index);
        }
    }
}
