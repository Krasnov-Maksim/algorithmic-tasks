package org.example;

/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors.
'#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

Example 3:
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 */
public class C_0621_BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(backspaceStringCompare("ab#c", "ad#c"));
        System.out.println(backspaceStringCompare("ab##", "c#d#"));
        System.out.println(backspaceStringCompare("a#c", "b"));
        System.out.println(backspaceStringCompare("a##c", "#a#c"));
        System.out.println(backspaceStringCompare("bxj##tw", "bxo#j##tw"));
    }

    private static boolean backspaceStringCompare(String s, String t) {
        String s1 = processString(s);
        String t1 = processString(t);
        return s1.equals(t1);
    }

    private static String processString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        int pos = 0;
        while (pos < stringBuilder.length()) {
            if (stringBuilder.charAt(pos) == '#'){
                if (pos > 0 && stringBuilder.charAt(pos - 1) != '#'){ //is there digit on the left ?
                    stringBuilder.deleteCharAt(pos - 1); //delete digit on the left
                    pos--;
                }
                stringBuilder.deleteCharAt(pos); //delete '#'
                pos--;
            }
            pos++;
        }
        return stringBuilder.toString();
    }
}
